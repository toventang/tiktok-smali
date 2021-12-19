package com.bytedance.android.livesdk.chatroom.end;

import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.bytedance.android.live.b.i;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.c.c;
import com.bytedance.android.live.core.d.c;
import com.bytedance.android.live.n.j;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.j.bd;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveEndUseLynx;
import com.bytedance.android.livesdk.model.k;
import com.bytedance.android.livesdk.widget.LiveLoadingView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

public final class f extends com.bytedance.android.livesdk.ui.a implements j {

    /* renamed from: a  reason: collision with root package name */
    public long f15433a;

    /* renamed from: b  reason: collision with root package name */
    public long f15434b;

    /* renamed from: c  reason: collision with root package name */
    private Room f15435c;

    /* renamed from: d  reason: collision with root package name */
    private long f15436d;

    /* renamed from: e  reason: collision with root package name */
    private long f15437e;

    /* renamed from: f  reason: collision with root package name */
    private final i f15438f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f15439g = LiveEndUseLynx.INSTANCE.getValue();

    /* renamed from: h  reason: collision with root package name */
    private HashMap f15440h;

    static {
        Covode.recordClassIndex(8525);
    }

    public final View a(int i2) {
        if (this.f15440h == null) {
            this.f15440h = new HashMap();
        }
        View view = (View) this.f15440h.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f15440h.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.live.n.j
    public final Fragment a() {
        return this;
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f15440h;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public static final class b implements i.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f15442a;

        static {
            Covode.recordClassIndex(8527);
        }

        @Override // com.bytedance.android.live.b.i.c
        public final void a() {
            ImageView imageView = (ImageView) this.f15442a.a(R.id.qk);
            l.b(imageView, "");
            imageView.setVisibility(0);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(f fVar) {
            this.f15442a = fVar;
        }

        @Override // com.bytedance.android.live.b.i.c
        public final void a(String str) {
            l.d(str, "");
            this.f15442a.f15433a = System.currentTimeMillis();
        }

        @Override // com.bytedance.android.live.b.i.c
        public final void c(String str) {
            l.d(str, "");
            c.a("ttlive_anchor_finish_page_load_status_all", 1, 0);
        }

        @Override // com.bytedance.android.live.b.i.c
        public final void b(String str) {
            l.d(str, "");
            LiveLoadingView liveLoadingView = (LiveLoadingView) this.f15442a.a(R.id.ci9);
            l.b(liveLoadingView, "");
            liveLoadingView.setVisibility(8);
            if (this.f15442a.f15433a > -1) {
                this.f15442a.f15434b = System.currentTimeMillis();
                c.a("ttlive_anchor_finish_page_load_duration", 0, this.f15442a.f15434b - this.f15442a.f15433a);
                this.f15442a.f15433a = -1;
                c.a("ttlive_anchor_finish_page_load_status_all", 0, 0);
            }
        }
    }

    public f() {
        com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(com.bytedance.android.live.b.f.class);
        l.b(a2, "");
        this.f15438f = ((com.bytedance.android.live.b.f) a2).getHybridContainerManager();
    }

    private static String b() {
        IHostContext iHostContext = (IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class);
        if (iHostContext != null) {
            return String.valueOf(iHostContext.appId());
        }
        return "";
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.f15437e += SystemClock.elapsedRealtime() - this.f15436d;
        i iVar = this.f15438f;
        if (iVar != null) {
            iVar.a("container_disappear", new JSONObject());
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f15436d = SystemClock.elapsedRealtime();
        i iVar = this.f15438f;
        if (iVar != null) {
            iVar.a("container_appear", new JSONObject());
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        i iVar = this.f15438f;
        if (iVar != null) {
            iVar.a();
        }
        b.a.a("live_end_duration").a().c("video_type").d("live_detail").a("duration", String.valueOf(this.f15437e)).b();
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f15441a;

        static {
            Covode.recordClassIndex(8526);
        }

        a(f fVar) {
            this.f15441a = fVar;
        }

        public final void onClick(View view) {
            e activity = this.f15441a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    private static String a(Room room) {
        ImageModel avatarLarge;
        List<String> urls;
        String str;
        User owner = room.getOwner();
        if (owner == null || (avatarLarge = owner.getAvatarLarge()) == null || (urls = avatarLarge.getUrls()) == null || urls.isEmpty() || urls == null || (str = urls.get(0)) == null) {
            return "";
        }
        return str;
    }

    private static String b(Room room) {
        String valueOf;
        User owner = room.getOwner();
        if (owner == null || (valueOf = String.valueOf(owner.getId())) == null) {
            return "";
        }
        return valueOf;
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Window window;
        h.f.a.b bVar = (h.f.a.b) DataChannelGlobal.f34575d.b(bd.class);
        if (bVar != null) {
            bVar.invoke(0);
        }
        super.onCreate(bundle);
        k.END.config();
        this.f15435c = (Room) DataChannelGlobal.f34575d.b(ac.class);
        e activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setSoftInputMode(18);
        }
    }

    private final String a(String str) {
        Room room = this.f15435c;
        if (room == null) {
            return "";
        }
        if (str == null) {
            str = "";
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        String a2 = a(room);
        String b2 = b(room);
        String valueOf = String.valueOf(room.getId());
        String b3 = b();
        buildUpon.appendQueryParameter("live_enter_from", "");
        if (!TextUtils.isEmpty(a2)) {
            buildUpon.appendQueryParameter("anchor_avatar", a2);
        }
        if (!TextUtils.isEmpty(b2)) {
            buildUpon.appendQueryParameter("user_id", b2);
        }
        if (!TextUtils.isEmpty(valueOf)) {
            buildUpon.appendQueryParameter("room_id", valueOf);
        }
        if (!TextUtils.isEmpty(b3)) {
            buildUpon.appendQueryParameter("aid", b3);
        }
        String builder = buildUpon.toString();
        l.b(builder, "");
        return builder;
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        String str3;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        Room room = this.f15435c;
        String str4 = null;
        if (room != null) {
            str = room.finish_url;
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            Room room2 = this.f15435c;
            if (room2 != null) {
                str2 = room2.finish_url;
            } else {
                str2 = null;
            }
            Room room3 = this.f15435c;
            if (room3 != null) {
                str4 = room3.finishUrlLynx;
            }
            if (str4 == null || str4.length() == 0) {
                this.f15439g = false;
            }
            if (!this.f15439g) {
                str4 = str2;
            }
            String a2 = a(str4);
            String a3 = a(str2);
            i iVar = this.f15438f;
            if (iVar != null) {
                if (this.f15439g) {
                    str3 = "lynx";
                } else {
                    str3 = "h5";
                }
                FrameLayout frameLayout = (FrameLayout) a(R.id.h1);
                l.b(frameLayout, "");
                iVar.a(str3, a2, a3, frameLayout, new b(this));
            }
            c.a.a("ttlive_end_url").a("end_url", a2).a();
            ((ImageView) a(R.id.qk)).setOnClickListener(new a(this));
            if (this.f15439g) {
                ImageView imageView = (ImageView) a(R.id.qk);
                l.b(imageView, "");
                imageView.setVisibility(8);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(LayoutInflater.from(getContext()), R.layout.b9i, viewGroup, false);
    }
}
