package Adapter;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import tech.iwish.farm_fresh.R;

import static android.content.Context.MODE_PRIVATE;

/**
 * Created by Rajesh Dabhi on 4/7/2017.
 */

public class View_time_adapter extends RecyclerView.Adapter<View_time_adapter.MyViewHolder> {

    private List<String> modelList;

    private Context context;
    SharedPreferences preferences;
    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.tv_socity_name);
        }
    }

    public View_time_adapter(List<String> modelList) {
        this.modelList = modelList;
    }

    @Override
    public View_time_adapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_socity_rv, parent, false);

        context = parent.getContext();

        return new View_time_adapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(View_time_adapter.MyViewHolder holder, int position) {
        //Socity_model mList = modelList.get(position);
        preferences = context.getSharedPreferences("lan", MODE_PRIVATE);
        String language=preferences.getString("language","");
if (language.contains("spanish")) {
    String time=modelList.get(position);
    time=time.replace("PM","م");
    time=time.replace("AM","ص");
    holder.title.setText(time);

}else {
    holder.title.setText(modelList.get(position));

}

    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

}
