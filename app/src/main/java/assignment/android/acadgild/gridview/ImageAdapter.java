package assignment.android.acadgild.gridview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by DivyaVipin on 12/20/2016.
 */
public class ImageAdapter extends BaseAdapter {
    private Integer[] imageIds={R.drawable.ginger,R.drawable.honeycomb,R.drawable.icecream,R.drawable.jellybean,R.drawable.kitkat,R.drawable.lollipop};
    public ImageAdapter(Context context) {
        this.context = context;
    }

    private Context context;


    @Override
    public int getCount() {
        return imageIds.length;
    }

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
        ImageView imageView;
        if(view == null)
        {
            imageView=new ImageView(context);
            imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        }
        else {
            imageView = (ImageView) view;
        }
        imageView.setImageResource(imageIds[i]);
        return imageView;
    }

}
