package Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import tech.iwish.farm_fresh.R;

public class About_us_fragment extends Fragment {

    private static String TAG = About_us_fragment.class.getSimpleName();

    private TextView tv_info;

    public About_us_fragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_terms_condition, container, false);

        tv_info = (TextView) view.findViewById(R.id.tv_info);

//        String geturl = getArguments().getString("url");
//        //   String title = getArguments().getString("title");
//
//        ((MainActivity) getActivity()).setTitle(getResources().getString(R.string.nav_about));
//
//        // check internet connection
//        if (ConnectivityReceiver.isConnected()) {
//            makeGetInfoRequest(geturl);
//        } else {
//            ((MainActivity) getActivity()).onNetworkConnectionChanged(false);
//        }

        return view;
    }

    /**
     * Method to make json object request where json response starts wtih
     */
//    private void makeGetInfoRequest(String url) {
//
//        // Tag used to cancel the request
//        String tag_json_obj = "json_info_req";
//
//        JsonObjectRequest jsonObjReq = new JsonObjectRequest(Request.Method.GET,
//                url, null,new Response.Listener<JSONObject>() {
//            @Override
//            public void onResponse(JSONObject response) {
//                Log.d(TAG, response.toString());
//
//                try {
//                    // Parsing json array response
//                    // loop through each json object
//
//                    boolean status = response.getBoolean("responce");
//                    if (status) {
//
//                        List<Support_info_model> support_info_modelList = new ArrayList<>();
//
//                        Gson gson = new Gson();
//                        Type listType = new TypeToken<List<Support_info_model>>() {
//                        }.getType();
//
//                        support_info_modelList = gson.fromJson(response.getString("data"), listType);
//
//                        String desc = support_info_modelList.get(0).getPg_descri();
//                        String title = support_info_modelList.get(0).getPg_title();
//
//                        tv_info.setText(Html.fromHtml(desc));
//
//                    }
//
//                } catch (JSONException e) {
//                    e.printStackTrace();
//                    Toast.makeText(getActivity(),
//                            "Error: " + e.getMessage(),
//                            Toast.LENGTH_LONG).show();
//                }
//            }
//        }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//                VolleyLog.d(TAG, "Error: " + error.getMessage());
//                if (error instanceof TimeoutError || error instanceof NoConnectionError) {
//                    Toast.makeText(getActivity(), getResources().getString(R.string.connection_time_out), Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//
//        // Adding request to request queue
//        AppController.getInstance().addToRequestQueue(jsonObjReq, tag_json_obj);
//    }

}

