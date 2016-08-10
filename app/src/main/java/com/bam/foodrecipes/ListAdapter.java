package com.bam.foodrecipes;

public class ListAdapter extends RecyclerAdapter {

    private final ListFragment.RecipeSelectable mListener;

    public ListAdapter(ListFragment.RecipeSelectable listener) {
        mListener = listener;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.list_item;
    }

    @Override
    protected void onListRecipceSelected(int index) {
        mListener.onListRecipceSelected(index);
    }
}
