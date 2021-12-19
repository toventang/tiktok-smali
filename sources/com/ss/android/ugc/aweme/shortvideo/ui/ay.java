package com.ss.android.ugc.aweme.shortvideo.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.t;
import com.ss.android.ugc.aweme.geofencing.GeoFencingSettingItem;
import com.ss.android.ugc.aweme.shortvideo.k.b;
import com.ss.android.ugc.aweme.shortvideo.model.AddToPlaylistItemStatus;
import com.ss.android.ugc.aweme.shortvideo.ui.viewmodel.VideoPublishViewModel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;

public final class ay extends ax {

    /* renamed from: d  reason: collision with root package name */
    public static final a f131434d = new a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    private GeoFencingSettingItem f131435e;

    /* renamed from: f  reason: collision with root package name */
    private RelativeLayout f131436f;

    /* renamed from: g  reason: collision with root package name */
    private HashMap f131437g;

    static {
        Covode.recordClassIndex(86103);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.ax
    public final void a() {
        HashMap hashMap = this.f131437g;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.ax, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(86104);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.ax
    public final void a(View view) {
        boolean z;
        l.d(view, "");
        super.a(view);
        Bundle arguments = getArguments();
        if (arguments != null) {
            z = arguments.getBoolean("key_added_to_playlist", false);
        } else {
            z = false;
        }
        JediViewModel a2 = t.a(requireActivity()).a(VideoPublishViewModel.class);
        l.b(a2, "");
        VideoPublishViewModel videoPublishViewModel = (VideoPublishViewModel) a2;
        com.ss.android.ugc.aweme.geofencing.a b2 = videoPublishViewModel.b();
        AddToPlaylistItemStatus a3 = videoPublishViewModel.a();
        GeoFencingSettingItem geoFencingSettingItem = (GeoFencingSettingItem) view.findViewById(R.id.bac);
        this.f131435e = geoFencingSettingItem;
        if (geoFencingSettingItem == null) {
            l.b();
        }
        b2.a(this, geoFencingSettingItem);
        if (b.a() && z) {
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.dda);
            this.f131436f = relativeLayout;
            if (relativeLayout == null) {
                l.b();
            }
            a3.bindView(relativeLayout, this);
            RelativeLayout relativeLayout2 = this.f131436f;
            if (relativeLayout2 != null) {
                relativeLayout2.setVisibility(0);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.ax, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        View a2 = com.a.a(layoutInflater, R.layout.ah3, viewGroup, false);
        l.b(a2, "");
        a(a2);
        return a2;
    }
}
