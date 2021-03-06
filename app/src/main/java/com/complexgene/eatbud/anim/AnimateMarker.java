package com.complexgene.eatbud.anim;

import android.graphics.Point;
import android.os.Handler;
import android.os.SystemClock;
import android.support.annotation.ColorRes;
import android.support.v4.view.animation.LinearOutSlowInInterpolator;
import android.view.animation.Interpolator;

import com.google.android.gms.maps.Projection;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class AnimateMarker {

    protected Marker addMarker(LatLng position, @ColorRes int color, boolean draggable) {
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.draggable(draggable);
        //markerOptions.icon(MapUtils.getIconBitmapDescriptor(getActivity(), color));
        markerOptions.position(position);
//        Marker pinnedMarker = googleMap.addMarker(markerOptions);
//        startDropMarkerAnimation(pinnedMarker);
//        return pinnedMarker;

        return null;
    }

    private void startDropMarkerAnimation(final Marker marker) {
        final LatLng target = marker.getPosition();
        final Handler handler = new Handler();
        final long start = SystemClock.uptimeMillis();
//        Projection proj = getMap().getProjection();
//        Point targetPoint = proj.toScreenLocation(target);
//        final long duration = (long) (200 + (targetPoint.y * 0.6));
//        Point startPoint = proj.toScreenLocation(marker.getPosition());
//        startPoint.y = 0;
//        final LatLng startLatLng = proj.fromScreenLocation(startPoint);
//        final Interpolator interpolator = new LinearOutSlowInInterpolator();
//        handler.post(new Runnable() {
//            @Override
//            public void run() {
//                long elapsed = SystemClock.uptimeMillis() - start;
//                float t = interpolator.getInterpolation((float) elapsed / duration);
//                double lng = t * target.longitude + (1 - t) * startLatLng.longitude;
//                double lat = t * target.latitude + (1 - t) * startLatLng.latitude;
//                marker.setPosition(new LatLng(lat, lng));
//                if (t < 1.0) {
//                    // Post again 16ms later == 60 frames per second
//                    handler.postDelayed(this, 16);
//                }
//            }
//        });
    }

}
