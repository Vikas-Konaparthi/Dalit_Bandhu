package com.example.kmc.PSAdapters;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kmc.Individual;
import com.example.kmc.PSLogin.userDetailsAmountDBtoBen;
import com.example.kmc.PSLogin.userDetailsAmountToDB;
import com.example.kmc.R;

import java.util.ArrayList;
import java.util.Locale;

public class myadapterPS3 extends RecyclerView.Adapter<myadapterPS3.myviewholder>
{
    ArrayList<Individual> datalist;

    public myadapterPS3(ArrayList<Individual> datalist) {
        this.datalist = datalist;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.singlerow,parent,false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, @SuppressLint("RecyclerView") int position) {
        holder.t1.setText(datalist.get(position).getName());
        holder.t2.setText("Status: "+datalist.get(position).getStatus());
        String inprogress="In Progress";
        String approve="approved";
        String reject="rejected";
        String collector_action_required1="Waiting for Collector Sanction";
        String collector_action_required2="Waiting for Collector Approval";

        if(datalist.get(position).getStatus().toLowerCase(Locale.ROOT).equals(approve.toLowerCase(Locale.ROOT)))
        {
            holder.t2.setTextColor(Color.parseColor("#00873E"));
        }else if(datalist.get(position).getStatus().toLowerCase(Locale.ROOT).equals(reject.toLowerCase(Locale.ROOT)))
        {
            holder.t2.setTextColor(Color.parseColor("#FF0000"));
        }else if(datalist.get(position).getStatus().toLowerCase(Locale.ROOT).equals(collector_action_required1.toLowerCase(Locale.ROOT))||datalist.get(position).getStatus().toLowerCase(Locale.ROOT).equals(collector_action_required2.toLowerCase(Locale.ROOT)))
        {
            holder.t2.setTextColor(Color.parseColor("#06038D"));
        }
        else{
            //#00873E
            holder.t2.setTextColor(Color.parseColor("#F6BE00"));
        }

        holder.t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(holder.t1.getContext(), userDetailsAmountDBtoBen.class);
                i.putExtra("uname",datalist.get(position).getName());
                i.putExtra("ufname",datalist.get(position).getFatherName());
                i.putExtra("uAge",datalist.get(position).getAge());
                i.putExtra("uHnumber",datalist.get(position).getHouseNo());
                i.putExtra("uVillage",datalist.get(position).getVillage());
                i.putExtra("uMandal",datalist.get(position).getMandal());
                i.putExtra("uDistrict",datalist.get(position).getDistrict());
                i.putExtra("uAadharNumber",datalist.get(position).getAadhar());
                i.putExtra("uMobileNo",datalist.get(position).getPhoneNo() );
                i.putExtra("uPreferredUnit",datalist.get(position).getPreferredUnit());
                i.putExtra("uBankName",datalist.get(position).getBankName());
                i.putExtra("uBankAccNumber",datalist.get(position).getBankAccNo());
                i.putExtra("uCollectorApproved",datalist.get(position).getCtrApproved());
                i.putExtra("uBankIFSC",datalist.get(position).getBankIFSC());
                i.putExtra("uVendorBankIFSC",datalist.get(position).getVendorIFSC());
                i.putExtra("uVendorName",datalist.get(position).getVendorName());
                i.putExtra("uVendorBankAccountNo",datalist.get(position).getVendorAccountNo());
                i.putExtra("uVendorIFSC",datalist.get(position).getVendorIFSC());
                i.putExtra("uVendorBankAccount",datalist.get(position).getVendorAccountNo());
                i.putExtra("uVendorName",datalist.get(position).getVendorName());
                i.putExtra("uSPApproved",datalist.get(position).getSpApproved());
                i.putExtra("uDBAccount",datalist.get(position).getDbAccount());

                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                holder.t1.getContext().startActivity(i);

            }
        });
        holder.t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(holder.t1.getContext(), userDetailsAmountDBtoBen.class);
                i.putExtra("uname",datalist.get(position).getName());
                i.putExtra("ufname",datalist.get(position).getFatherName());
                i.putExtra("uAge",datalist.get(position).getAge());
                i.putExtra("uHnumber",datalist.get(position).getHouseNo());
                i.putExtra("uVillage",datalist.get(position).getVillage());
                i.putExtra("uMandal",datalist.get(position).getMandal());
                i.putExtra("uDistrict",datalist.get(position).getDistrict());
                i.putExtra("uAadharNumber",datalist.get(position).getAadhar());
                i.putExtra("uMobileNo",datalist.get(position).getPhoneNo() );
                i.putExtra("uPreferredUnit",datalist.get(position).getPreferredUnit());
                i.putExtra("uBankName",datalist.get(position).getBankName());
                i.putExtra("uBankAccNumber",datalist.get(position).getBankAccNo());
                i.putExtra("uCollectorApproved",datalist.get(position).getCtrApproved());
                i.putExtra("uBankIFSC",datalist.get(position).getBankIFSC());
                i.putExtra("uVendorBankIFSC",datalist.get(position).getVendorIFSC());
                i.putExtra("uVendorName",datalist.get(position).getVendorName());
                i.putExtra("uVendorBankAccountNo",datalist.get(position).getVendorAccountNo());
                i.putExtra("uVendorIFSC",datalist.get(position).getVendorIFSC());
                i.putExtra("uVendorBankAccount",datalist.get(position).getVendorAccountNo());
                i.putExtra("uVendorName",datalist.get(position).getVendorName());
                i.putExtra("uSPApproved",datalist.get(position).getSpApproved());
                i.putExtra("uDBAccount",datalist.get(position).getDbAccount());

                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                holder.t2.getContext().startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return datalist.size();
    }

    class myviewholder extends RecyclerView.ViewHolder
    {
        TextView t1;
        TextView t2;
        public myviewholder(@NonNull View itemView) {
            super(itemView);
            t1=itemView.findViewById(R.id.t1);
            t2=itemView.findViewById(R.id.t2);
        }
    }
}