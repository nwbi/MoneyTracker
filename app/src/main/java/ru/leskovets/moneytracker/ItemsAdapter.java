package ru.leskovets.moneytracker;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

class ItemsAdapter extends RecyclerView.Adapter<ItemViewHolder> {


        final List<Item> items = new ArrayList<>();

        ItemsAdapter() {
            items.add(new Item("milk Prostokvashino 3,2%", 60));
            items.add(new Item("apple", 50));
            items.add(new Item("fun maker", 100));
            items.add(new Item("lemon 1 kg", 40));
            items.add(new Item("fruits 3 kg", 1000));
            items.add(new Item("red fish", 670));
            items.add(new Item("bread", 50));
            items.add(new Item("rice 1 sht.", 33));
            items.add(new Item("icecream Korovka", 58));
            items.add(new Item("gun", 4550));
            items.add(new Item("car Lada Granda, red color", 100000));
            items.add(new Item("juice", 50));
            items.add(new Item("mouse", 750));
            items.add(new Item("android super smartfon Lenovo K5 Vibe", 4550));
        }

        @Override
        public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new ItemViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item, null));
        }

        @Override
        public void onBindViewHolder(ItemViewHolder holder, int position) {
            final Item item = items.get(position);
            holder.name.setText(item.name);
            holder.price.setText(String.valueOf(item.price));
        }

        @Override
        public int getItemCount() {
            return items.size();
        }
    }

    class ItemViewHolder extends RecyclerView.ViewHolder {

        public TextView name;
        public TextView price;

        ItemViewHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.name);
            price = (TextView) itemView.findViewById(R.id.price);
        }
    }
