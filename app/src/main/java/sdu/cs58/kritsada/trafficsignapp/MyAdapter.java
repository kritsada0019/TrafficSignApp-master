package sdu.cs58.kritsada.trafficsignapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by 37-SDU on 3/28/2018.
 */


// class ทำหน้าที่ layout เสมือน เพื่อนำไปเสนอบนหน้าactivity
public class MyAdapter extends BaseAdapter{
    //explicit ประกาศตัวแปร
    private Context context;
    private int[] ints;
    private String[] titleStrings, detailStrings; //เก็บข้อมูลชื่อและรายละเอียดของป้ายจราจร

    public MyAdapter(Context context, int[] ints, String[] titleStrings, String[] detailStrings) {
        this.context = context;
        this.ints = ints;
        this.titleStrings = titleStrings;
        this.detailStrings = detailStrings;
    }

    @Override
    public int getCount() {
        return ints.length; //รับข้อมูล method getcount
    }//นับจำนวนข้อมูลใน array

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view1 = layoutInflater.inflate(R.layout.my_listview,viewGroup,false);

        //ผูกตัวแปร ที่หน้า my_listview
        ImageView imageView = view1.findViewById(R.id.imageView);
        TextView titleTextView = view1.findViewById(R.id.txv1);
        TextView detailTextView = view1.findViewById(R.id.txv2);
        //นำข้อมูลไปแสดงผลบนแอพ
        imageView.setImageResource(ints[i]);
        titleTextView.setText(titleStrings[i]);
        detailTextView.setText(detailStrings[i]);
        return view1;
    }//end getview
}//end class
