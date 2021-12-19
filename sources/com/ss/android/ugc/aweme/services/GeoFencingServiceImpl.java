package com.ss.android.ugc.aweme.services;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.m;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.geofencing.GeoFencingSettingItem;
import com.ss.android.ugc.aweme.services.external.IGeofencingService;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;

public final class GeoFencingServiceImpl implements IGeofencingService {
    public static final GeoFencingServiceImpl INSTANCE = new GeoFencingServiceImpl();

    private GeoFencingServiceImpl() {
    }

    static {
        Covode.recordClassIndex(79448);
    }

    @Override // com.ss.android.ugc.aweme.services.external.IGeofencingService
    public final void injectGeoFencingSettingItem(Aweme aweme, FrameLayout frameLayout, m mVar) {
        MethodCollector.i(9835);
        l.d(aweme, "");
        l.d(frameLayout, "");
        l.d(mVar, "");
        List<String> geofencingRegions = aweme.getGeofencingRegions();
        if (geofencingRegions == null || geofencingRegions.isEmpty()) {
            frameLayout.setVisibility(8);
            MethodCollector.o(9835);
            return;
        }
        frameLayout.setVisibility(0);
        View a2 = a.a(LayoutInflater.from(frameLayout.getContext()), R.layout.afr, frameLayout, false);
        if (a2 != null) {
            GeoFencingSettingItem geoFencingSettingItem = (GeoFencingSettingItem) a2;
            frameLayout.addView(geoFencingSettingItem);
            l.d(mVar, "");
            if (!GeoFencingSettingItem.a()) {
                geoFencingSettingItem.f98993a.observe(mVar, new GeoFencingSettingItem.b(geoFencingSettingItem));
                com.ss.android.ugc.aweme.geofencing.b.a.a(new GeoFencingSettingItem.c(geoFencingSettingItem, geofencingRegions));
            }
            geoFencingSettingItem.setReadOnly(true);
            MethodCollector.o(9835);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.geofencing.GeoFencingSettingItem");
        MethodCollector.o(9835);
        throw nullPointerException;
    }
}
