package com.example.test_1;

import android.content.Context;
import android.widget.Toast;

public class StoreClass {
    Context context;
    String str;

    public StoreClass() {
    }

    public StoreClass(Context context, String str) {
        this.context = context;
        this.str = str;
    }
    void MyToast_(String str){
        Toast.makeText(context,str,Toast.LENGTH_SHORT).show();
    }
}
