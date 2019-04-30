package com.example.realmlistas.adapters;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.example.realmlistas.R;
import com.example.realmlistas.models.LugaresModel;
import java.util.List;

public class LugaresAdapter extends ArrayAdapter<LugaresModel> {

    public LugaresAdapter(@NonNull Context context, List<LugaresModel> lugares) {
        super(context, 0, lugares );
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (null == convertView) {
            convertView = inflater.inflate(
                    R.layout.list_item_lugares,
                    parent,
                    false);
        }

        TextView lugar = convertView.findViewById(R.id.tv_lugar);
        TextView provincia = convertView.findViewById(R.id.tv_provincia);

        LugaresModel item = getItem(position);

        lugar.setText(item.getLugar());
        provincia.setText(item.getProvincia());

        return convertView;
    }


}

