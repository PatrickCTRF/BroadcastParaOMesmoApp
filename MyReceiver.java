package com.example.patrick.broadcastenvia;

/**
 * Created by patrick on 12/14/16.
 */
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyReceiver extends BroadcastReceiver{

    @Override
    public void onReceive(Context context, Intent intent) {
        MainActivity mainActivity = ((MyApplication) context.getApplicationContext()).mainActivity;
        mainActivity.etReceivedBroadcast.append("\nbroadcast: "+intent.getAction()+"\n");
    }

}
