package com.bam.foodrecipes;

public class GridAdapter extends RecyclerAdapter {

    private final GridFragment.RecipeSelectable mListener;

    public GridAdapter(GridFragment.RecipeSelectable listener) {
        mListener = listener;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.grid_item;
    }

    @Override
    protected void onListRecipceSelected(int index) {
        mListener.onGridRecipceSelected(index);
    }
}