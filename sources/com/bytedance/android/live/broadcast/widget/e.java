package com.bytedance.android.live.broadcast.widget;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.x;
import com.bytedance.android.live.core.d.c;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.n.h;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverCropCustomStyleSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.android.livesdk.ui.a;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.utils.l;
import com.bytedance.android.livesdkapi.depend.model.live.i;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.f;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class e implements View.OnClickListener {

    /* renamed from: k  reason: collision with root package name */
    private static int f8771k = 1;

    /* renamed from: l  reason: collision with root package name */
    private static int f8772l = 1;

    /* renamed from: m  reason: collision with root package name */
    private static int f8773m = 750;
    private static int n = 750;

    /* renamed from: a  reason: collision with root package name */
    HSImageView f8774a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f8775b;

    /* renamed from: c  reason: collision with root package name */
    a f8776c;

    /* renamed from: d  reason: collision with root package name */
    public h f8777d;

    /* renamed from: e  reason: collision with root package name */
    public String f8778e;

    /* renamed from: f  reason: collision with root package name */
    public final f.a.b.a f8779f;

    /* renamed from: g  reason: collision with root package name */
    public DataChannel f8780g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f8781h;

    /* renamed from: i  reason: collision with root package name */
    public com.bytedance.android.live.base.model.user.a f8782i;

    /* renamed from: j  reason: collision with root package name */
    User f8783j;

    public final void b() {
        if (this.f8778e == null) {
            this.f8777d.c();
        }
    }

    static {
        Covode.recordClassIndex(4486);
    }

    public final String a() {
        com.bytedance.android.live.base.model.user.a aVar = this.f8782i;
        if (aVar == null) {
            return "";
        }
        if (aVar.f7451a != null) {
            return this.f8782i.f7451a;
        }
        if (!b.a((Collection) this.f8782i.f7452b)) {
            return Uri.parse(this.f8782i.f7452b.get(0)).toString();
        }
        return "";
    }

    /* access modifiers changed from: package-private */
    public final String c() {
        i iVar = (i) f.a(this.f8776c).b(x.class);
        if (iVar == null || iVar.equals(i.VIDEO) || !iVar.equals(i.THIRD_PARTY)) {
            return "video_live";
        }
        return "third_party";
    }

    public static com.bytedance.android.live.base.model.user.a a(ImageModel imageModel) {
        if (imageModel == null) {
            return null;
        }
        com.bytedance.android.live.base.model.user.a aVar = new com.bytedance.android.live.base.model.user.a();
        aVar.f7451a = imageModel.mUri;
        aVar.f7452b = imageModel.mUrls;
        return aVar;
    }

    public final void a(Throwable th) {
        String str;
        if (th instanceof com.bytedance.android.live.a.a.b.a) {
            str = ((com.bytedance.android.live.a.a.b.a) th).getErrorMsg();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            str = y.a((int) R.string.gxj);
        }
        this.f8778e = null;
        if (this.f8776c.isViewValid()) {
            this.f8777d.b();
            ao.a(y.e(), str, 0);
        }
    }

    public void onClick(View view) {
        if (view.getId() == R.id.ccc) {
            b();
            HashMap hashMap = new HashMap();
            hashMap.put("live_type", c());
            User user = this.f8783j;
            if (user != null) {
                hashMap.put("anchor_id", String.valueOf(user.getId()));
            }
            c.a("ttlive_upload_cover_start", 0, (JSONObject) null);
            b.a.a("livesdk_cover_modify_click").a(this.f8780g).c("click").b("live").a((Map<String, String>) hashMap).b();
        }
    }

    public e(View view, a aVar, DataChannel dataChannel) {
        this(view, aVar, f8771k, f8772l, dataChannel);
    }

    private e(View view, a aVar, int i2, int i3, DataChannel dataChannel) {
        com.bytedance.android.live.base.model.user.b bVar;
        boolean z;
        this.f8779f = new f.a.b.a();
        com.bytedance.android.livesdk.at.f b2 = u.a().b();
        User user = null;
        if (b2 != null) {
            bVar = b2.a();
        } else {
            bVar = null;
        }
        this.f8783j = bVar instanceof User ? (User) bVar : user;
        this.f8780g = dataChannel;
        f8771k = i2;
        f8772l = i3;
        if (i2 > i3) {
            f8773m = 480;
            n = 270;
        } else if (i2 < i3) {
            f8773m = 270;
            n = 480;
        }
        int value = LiveCoverMinSizeSetting.INSTANCE.getValue();
        f8773m = value;
        n = value;
        this.f8776c = aVar;
        HSImageView hSImageView = (HSImageView) view.findViewById(R.id.ccc);
        this.f8774a = hSImageView;
        hSImageView.setOnClickListener(this);
        this.f8775b = (TextView) view.findViewById(R.id.f24);
        androidx.fragment.app.e activity = this.f8776c.getActivity();
        a aVar2 = this.f8776c;
        int i4 = f8771k;
        int i5 = f8772l;
        int i6 = f8773m;
        int i7 = n;
        f fVar = new f(this);
        if (Build.VERSION.SDK_INT > 29 || LiveCoverCropCustomStyleSetting.INSTANCE.enable()) {
            z = true;
        } else {
            z = false;
        }
        this.f8777d = new l(activity, aVar2, "cover", i4, i5, i6, i7, fVar, z);
        if (this.f8776c.isViewValid()) {
            this.f8775b.setAlpha(0.64f);
        }
    }
}
