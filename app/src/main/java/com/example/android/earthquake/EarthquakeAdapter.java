package com.example.android.earthquake;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import static com.example.android.earthquake.R.layout.list_item;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {
    private String formatDate(Date dateObject) {
        @SuppressLint("SimpleDateFormat") SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }

    /**
     * Return the formatted date string (i.e. "4:30 PM") from a Date object.
     */
    private String formatTime(Date dateObject) {
        @SuppressLint("SimpleDateFormat") SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        return timeFormat.format(dateObject);
    }
    private static final String LOG_TAG = EarthquakeAdapter.class.getSimpleName();

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *  @param context        The current context. Used to inflate the layout file.
     * @param earthquakes A List of Earthquake objects to display in a list
     */

    public EarthquakeAdapter(Activity context, ArrayList<Earthquake> earthquakes) {
        super(context, 0, earthquakes);

    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(list_item, parent, false);
        }


        Earthquake currentEarthquake = getItem(position);


        TextView MagnitudeTextView = (TextView) listItemView.findViewById(R.id.magnitude_text);
        MagnitudeTextView.setText(currentEarthquake.getMagnitude());


        TextView LocationTextView = (TextView) listItemView.findViewById(R.id.location_text);
        LocationTextView .setText(currentEarthquake.getLocation());

        Date dateObject = new Date(currentEarthquake.getTimeInMilliseconds());

        TextView DateTextView = (TextView) listItemView.findViewById(R.id.date_text);
        String formattedDate = formatDate(dateObject);
        DateTextView.setText(formattedDate);

        TextView timeView = (TextView) listItemView.findViewById(R.id.date_time);
        // Format the time string (i.e. "4:30PM")
        String formattedTime = formatTime(dateObject);
        // Display the time of the current earthquake in that TextView
        timeView.setText(formattedTime);

        return listItemView;
    }

}
