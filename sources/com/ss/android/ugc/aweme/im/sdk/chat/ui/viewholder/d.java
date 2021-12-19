package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder;

import android.text.TextUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.im.sdk.chat.b.a;
import com.ss.android.ugc.aweme.im.sdk.chat.b.c.k;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.activity.ChatRoomActivity;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.n;
import com.ss.android.ugc.aweme.im.sdk.common.ui.widget.KeepSurfaceTextureView;
import com.ss.android.ugc.aweme.im.service.f;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import f.a.b.b;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class d extends a {

    /* renamed from: e  reason: collision with root package name */
    private static volatile d f101416e;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, Object> f101417a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    Map<String, f> f101418b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    public String f101419c = "";

    /* renamed from: d  reason: collision with root package name */
    public boolean f101420d;

    /* renamed from: f  reason: collision with root package name */
    private List<BaseContent> f101421f = new CopyOnWriteArrayList();

    /* renamed from: g  reason: collision with root package name */
    private Set<String> f101422g = new HashSet();

    /* renamed from: h  reason: collision with root package name */
    private Map<String, KeepSurfaceTextureView> f101423h = new ConcurrentHashMap();

    /* renamed from: i  reason: collision with root package name */
    private int f101424i = -1;

    /* renamed from: j  reason: collision with root package name */
    private volatile b f101425j;

    static {
        Covode.recordClassIndex(64857);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.b.a
    public final void a() {
        super.a();
        this.f101418b.clear();
        this.f101423h.clear();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.b.a
    public final void d() {
        k.a(new f(this), 200);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.b.a
    public final void b() {
        Map<String, Object> map = this.f101417a;
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                entry.getValue();
            }
        }
    }

    public static d f() {
        MethodCollector.i(4446);
        if (f101416e == null) {
            synchronized (d.class) {
                try {
                    if (f101416e == null) {
                        f101416e = new d();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(4446);
                    throw th;
                }
            }
        }
        d dVar = f101416e;
        MethodCollector.o(4446);
        return dVar;
    }

    private d() {
        Set<String> stringSet = n.a().f102428a.getStringSet("share_video_message_has_watched", null);
        if (!com.bytedance.common.utility.collection.b.a((Collection) stringSet)) {
            this.f101422g.addAll(stringSet);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.b.a
    public final void c() {
        super.c();
        n a2 = n.a();
        a2.f102428a.edit().putStringSet("share_video_message_has_watched", this.f101422g).commit();
        if (this.f101417a.get(this.f101419c) != null) {
            this.f101417a.get(this.f101419c);
        }
        this.f101417a.clear();
        this.f101421f.clear();
        if (!this.f101418b.isEmpty()) {
            for (Map.Entry<String, f> entry : this.f101418b.entrySet()) {
                entry.getValue().e();
            }
        }
        this.f101418b.clear();
        this.f101423h.clear();
        this.f101424i = -1;
        this.f101420d = false;
        if (this.f101425j != null) {
            this.f101425j.dispose();
            this.f101425j = null;
        }
    }

    public final Runnable a(RecyclerView recyclerView) {
        return new e(this, recyclerView);
    }

    public final synchronized void b(String str) {
        MethodCollector.i(4461);
        this.f101419c = str;
        MethodCollector.o(4461);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.b.a
    public final f a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        f fVar = this.f101418b.get(str);
        if (fVar == null && (fVar = com.ss.android.ugc.aweme.im.sdk.common.controller.e.b.a()) != null) {
            this.f101418b.put(str, fVar);
        }
        return fVar;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.b.a
    public final void a(RecyclerView recyclerView, int i2) {
        Map<String, Object> map;
        if (i2 == 0 && (ActivityStack.getTopActivity() instanceof ChatRoomActivity) && recyclerView != null && (recyclerView.getLayoutManager() instanceof LinearLayoutManager)) {
            Runnable a2 = a(recyclerView);
            if (!this.f101420d || (map = this.f101417a) == null || map.size() <= 0) {
                a2.run();
                return;
            }
            recyclerView.getAdapter().notifyDataSetChanged();
            k.a(a2);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.b.a
    public final void a(RecyclerView recyclerView, boolean z) {
        if (!z) {
            a(recyclerView, 0);
        } else if (this.f101417a.get(this.f101419c) != null) {
            this.f101417a.get(this.f101419c);
        }
    }
}
