package com.example.lesson6tablayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class CustomAdapter extends FragmentStateAdapter {

    public CustomAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        // Hardcoded in this order, you'll want to use lists and make sure the titles match
        if (position == 0) {
            return new GeneralFragment();
        }
        if (position == 1) {
            return new FactsFragment();
        }
        return new GalleryFragment();
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}