package com.example.recyclerviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


// =======   Make Costom adapter  =======
// step 1 : Extends adapter class to RecyclerView.Adapter<>
// step 2 : make a class ViewHolder and extends it RecyclerView.ViewHolder
// step 3 : make a constractor of ViewHolder with paramitar (View itemVier)
// Step 4 : Import onCreateViewHolder, onBindViewHolder, getItemCount meathods
// step 5 : in onCreateViewHolder
//           step 1: get the Recycler design ( contact_row ) and take it on View
//           [note] : in LayoutInflater we need a context but we don't know what context is it, so we need to declear a Context Global vareable and Coustom_adepter constactor
//           and this constactor paramiter will be Context, so that when we call this couston_adepter we need pass a contaxt.
//           step 2 : And  ViewHolder object and pass this View ( contact_row )
//           step 3 : return viewHolder
// step 6 : In ViewHolder
//           step 1 : Get all the view form the itemView (itemView.findViewById(R.id.idName)) in constactor of this class
// step 7 : In onBindViewHolder
//          set all the value of holder.view form datalist arrar position by index
//          [Note] : we need a dataList array, byt we don't have a dataList array so we declear a global variable ArrayList<> with the data type of Model_Class and
//          take a paramiter as a ArrayList<Model_class> in Coustom_adapter constactor
// step 8 : getItemCount
//          return arraylist.size();
//
//  ha ha you sucessfully make a coustom_adepter ==> Now Go to MainActivity.java comments [step : 7]

public class Recycle_Contact_Adapter extends RecyclerView.Adapter<Recycle_Contact_Adapter.ViewHolder>{

    Context context;
    ArrayList<Contact_model> dataList;

    public Recycle_Contact_Adapter(Context context, ArrayList<Contact_model> dataLists){
        this.dataList = dataLists;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.contact_row,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.img.setImageResource(dataList.get(position).image);
        holder.name.setText(dataList.get(position).name);
        holder.number.setText(dataList.get(position).number);
    }

    @Override
    public int getItemCount() {

        return dataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name, number;
        ImageView img;
        public ViewHolder(View itemView){
            super(itemView);
            this.name = itemView.findViewById(R.id.row_name);
            this.number = itemView.findViewById(R.id.row_number);
            this.img = itemView.findViewById(R.id.row_image);
        }
    }

}
