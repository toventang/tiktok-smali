package com.bytedance.android.livesdk.utils.crop;

import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import b.i;
import com.bytedance.android.livesdk.chatroom.c.am;
import com.bytedance.android.livesdk.utils.crop.CropView;
import com.bytedance.android.livesdk.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.f;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.HashMap;

public final class a extends v {

    /* renamed from: b  reason: collision with root package name */
    public static final C0486a f22311b = new C0486a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public h.f.a.b<? super String, z> f22312a;

    /* renamed from: c  reason: collision with root package name */
    private Uri f22313c;

    /* renamed from: d  reason: collision with root package name */
    private String f22314d;

    /* renamed from: e  reason: collision with root package name */
    private long f22315e = Long.MIN_VALUE;

    /* renamed from: f  reason: collision with root package name */
    private HashMap f22316f;

    static {
        Covode.recordClassIndex(13171);
    }

    @Override // com.bytedance.android.livesdk.v
    public final void a() {
        HashMap hashMap = this.f22316f;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final View a_(int i2) {
        if (this.f22316f == null) {
            this.f22316f = new HashMap();
        }
        View view = (View) this.f22316f.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f22316f.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    /* renamed from: com.bytedance.android.livesdk.utils.crop.a$a  reason: collision with other inner class name */
    public static final class C0486a {
        static {
            Covode.recordClassIndex(13172);
        }

        private C0486a() {
        }

        public /* synthetic */ C0486a(byte b2) {
            this();
        }

        public static a a(Uri uri) {
            l.d(uri, "");
            a aVar = new a();
            Bundle bundle = new Bundle();
            bundle.putParcelable("arg_origin_uri", uri);
            aVar.setArguments(bundle);
            return aVar;
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final v.b b() {
        v.b bVar = new v.b(R.layout.b95);
        bVar.f22382i = -1;
        return bVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f22315e != Long.MIN_VALUE) {
            com.bytedance.android.live.core.d.c.a("ttlive_crop_fragment_all", 0, SystemClock.elapsedRealtime() - this.f22315e);
            this.f22315e = Long.MIN_VALUE;
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f22317a;

        static {
            Covode.recordClassIndex(13173);
        }

        b(a aVar) {
            this.f22317a = aVar;
        }

        public final void onClick(View view) {
            this.f22317a.dismiss();
        }
    }

    public final void a(h.f.a.b<? super String, z> bVar) {
        l.d(bVar, "");
        this.f22312a = bVar;
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DataChannel a2 = f.a(this);
        if (a2 != null) {
            a2.b(am.class, (Object) true);
        }
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DataChannel a2 = f.a(this);
        if (a2 != null) {
            a2.b(am.class, (Object) false);
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f22313c = (Uri) arguments.getParcelable("arg_origin_uri");
            this.f22314d = arguments.getString("arg_origin_path");
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f22318a;

        static {
            Covode.recordClassIndex(13174);
        }

        c(a aVar) {
            this.f22318a = aVar;
        }

        public final void onClick(View view) {
            h.f.a.b<? super String, z> bVar = this.f22318a.f22312a;
            if (bVar != null) {
                CropView cropView = (CropView) this.f22318a.a_(R.id.ah8);
                l.d(bVar, "");
                PinchImageView pinchImageView = cropView.f22260a;
                if (pinchImageView == null) {
                    l.a("mCoverImage");
                }
                if (pinchImageView.getPinchMode() == 0) {
                    i.b(new CropView.e(cropView), i.f4824a).a(new CropView.f(bVar), i.f4826c, null);
                }
            }
            this.f22318a.dismiss();
        }
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v
    public final void show(androidx.fragment.app.i iVar, String str) {
        l.d(iVar, "");
        l.d(str, "");
        this.f22315e = SystemClock.elapsedRealtime();
        super.show(iVar, str);
    }

    @Override // com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        CropView cropView = (CropView) a_(R.id.ah8);
        String str = this.f22314d;
        if (str != null) {
            cropView.setOriginPath(str);
        } else {
            cropView.setOriginUri(this.f22313c);
        }
        ((ImageView) a_(R.id.ewf)).setOnClickListener(new b(this));
        ((ImageView) a_(R.id.exb)).setOnClickListener(new c(this));
    }
}
