package ru.leskovets.moneytracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView add;
    EditText name;
    EditText number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(R.layout.items);
        //add = (TextView) findViewById(R.id.add);
        //name = (EditText) findViewById(R.id.name);
        //number = (EditText) findViewById(R.id.price);
       final RecyclerView items = (RecyclerView) findViewById(R.id.items);
        items.setAdapter(new ItemsAdapter());


//        TextWatcher watcher = new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int before, int count) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//                add.setEnabled(!TextUtils.isEmpty(name.getText().toString().trim()) && !TextUtils.isEmpty(number.getText().toString().trim()));
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//
//            }
//
//        };
//
//        name.addTextChangedListener(watcher);
//        number.addTextChangedListener(watcher);
    }

    private class ItemsAdapter extends RecyclerView.Adapter<ItemViewHolder> {
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

    private class ItemViewHolder extends RecyclerView.ViewHolder {
        private final TextView name, price;

        ItemViewHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.name);
            price = (TextView) itemView.findViewById(R.id.price);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}