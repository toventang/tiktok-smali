package com.ss.android.ugc.aweme.live.b;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.feed.ab.e;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;

public final class b implements View.OnAttachStateChangeListener {

    /* renamed from: i  reason: collision with root package name */
    public static final a f108337i = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f108338a;

    /* renamed from: b  reason: collision with root package name */
    public final SmartImageView f108339b;

    /* renamed from: c  reason: collision with root package name */
    public final SmartImageView f108340c;

    /* renamed from: d  reason: collision with root package name */
    public final SmartImageView f108341d;

    /* renamed from: e  reason: collision with root package name */
    public final String f108342e = SettingsManager.a().a("live_audio_animation_resource", "");

    /* renamed from: f  reason: collision with root package name */
    public final List<String> f108343f = e.a();

    /* renamed from: g  reason: collision with root package name */
    public LiveRoomStruct f108344g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f108345h;

    /* renamed from: j  reason: collision with root package name */
    private final View f108346j;

    static {
        Covode.recordClassIndex(69411);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(69412);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void a() {
        SmartImageView smartImageView = this.f108341d;
        if (smartImageView != null) {
            smartImageView.setUserVisibleHint(false);
        }
        SmartImageView smartImageView2 = this.f108341d;
        if (smartImageView2 != null) {
            smartImageView2.c();
        }
    }

    public final boolean c() {
        LiveRoomStruct liveRoomStruct = this.f108344g;
        if (liveRoomStruct == null || !liveRoomStruct.liveTypeAudio || !this.f108345h) {
            return false;
        }
        return true;
    }

    public final void b() {
        if (c()) {
            SmartImageView smartImageView = this.f108341d;
            if (smartImageView != null) {
                smartImageView.setUserVisibleHint(true);
            }
            SmartImageView smartImageView2 = this.f108341d;
            if (smartImageView2 != null) {
                smartImageView2.b();
            }
        }
    }

    public final void onViewAttachedToWindow(View view) {
        SmartImageView smartImageView = this.f108341d;
        if (smartImageView != null) {
            smartImageView.setAttached(true);
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        SmartImageView smartImageView = this.f108341d;
        if (smartImageView != null) {
            smartImageView.setAttached(false);
        }
    }

    public b(View view) {
        l.d(view, "");
        this.f108346j = view;
        this.f108338a = (ViewGroup) view.findViewById(R.id.ng);
        this.f108339b = (SmartImageView) view.findViewById(R.id.ne);
        this.f108340c = (SmartImageView) view.findViewById(R.id.nf);
        this.f108341d = (SmartImageView) view.findViewById(R.id.nd);
        view.addOnAttachStateChangeListener(this);
    }

    public static String a(List<String> list, String str) {
        int i2;
        long j2;
        l.d(list, "");
        if (h.a(list)) {
            return null;
        }
        int i3 = 0;
        if (str != null) {
            try {
                j2 = Long.parseLong(str);
            } catch (Exception unused) {
                i2 = 0;
            }
        } else {
            j2 = 0;
        }
        i2 = (int) (j2 % ((long) list.size()));
        if (i2 >= 0 && i2 < list.size()) {
            i3 = i2;
        }
        return list.get(i3);
    }
}
