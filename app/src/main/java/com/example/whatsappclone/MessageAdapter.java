package com.example.whatsappclone;

import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.whatsappclone.Chat.ChatObject;
import com.example.whatsappclone.Chat.MessageObject;

import java.util.ArrayList;

public class MessageAdapter extends RecyclerView.Adapter<com.example.whatsappclone.MessageAdapter.MessageViewHolder> {

    ArrayList<MessageObject> messageList;

    public MessageAdapter(ArrayList<MessageObject> Message)
    {
        this.messageList = Message;
    }

    @NonNull
    @Override
    public MessageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_message,null,false);
        RecyclerView.LayoutParams lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutView.setLayoutParams(lp);

        com.example.whatsappclone.MessageAdapter.MessageViewHolder rcv = new com.example.whatsappclone.MessageAdapter.MessageViewHolder(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(@NonNull com.example.whatsappclone.MessageAdapter.MessageViewHolder holder, int position) {
        holder.mMessage.setText(messageList.get(position).getMessage());
        holder.mSender.setText(messageList.get(position).getSenderId());
        holder.mLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }


    @Override
    public int getItemCount() {
        return messageList.size();
    }


    public class MessageViewHolder extends RecyclerView.ViewHolder {

        public TextView mMessage;
        public TextView mSender;

        LinearLayout mLayout;

        public MessageViewHolder(View view){
            super(view);
            mLayout=view.findViewById(R.id.layout);
            mMessage=view.findViewById(R.id.message);
            mSender=view.findViewById(R.id.sender);
        }
    }
}


