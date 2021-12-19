package com.ss.android.ugc.aweme.feed.n;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.c.d;
import com.bytedance.lighten.a.o;
import com.facebook.j.a.b;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.s;
import com.ss.android.ugc.aweme.feed.adapter.ce;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.logger.a;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

public final class j extends d {

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<ce> f93603a;

    /* renamed from: b  reason: collision with root package name */
    public Aweme f93604b;

    /* renamed from: c  reason: collision with root package name */
    public Video f93605c;

    /* renamed from: d  reason: collision with root package name */
    private long f93606d;

    /* renamed from: e  reason: collision with root package name */
    private com.ss.android.ugc.aweme.feed.helper.d f93607e;

    static {
        Covode.recordClassIndex(59555);
    }

    public final boolean a() {
        if (this.f93603a.get() == null || this.f93604b == null || this.f93605c == null) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.lighten.a.c.d, com.bytedance.lighten.a.c.k
    public final void a(Uri uri) {
        this.f93603a.clear();
        this.f93604b = null;
        this.f93605c = null;
    }

    public j(ce ceVar, com.ss.android.ugc.aweme.feed.helper.d dVar) {
        this.f93603a = new WeakReference<>(ceVar);
        this.f93604b = ceVar.b();
        this.f93607e = dVar;
    }

    @Override // com.bytedance.lighten.a.c.d, com.bytedance.lighten.a.c.k
    public final void a(Uri uri, View view) {
        this.f93606d = System.currentTimeMillis();
        i.b(new Callable<Object>() {
            /* class com.ss.android.ugc.aweme.feed.n.j.AnonymousClass1 */

            static {
                Covode.recordClassIndex(59556);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                if (j.this.a()) {
                    return null;
                }
                r.onEvent(MobClick.obtain().setEventName("image_request").setValue(j.this.f93604b.getAid()).setLabelName("perf_monitor").setJsonObject(new s().a("request_id", j.this.f93603a.get().ap().optString("request_id")).a()));
                return null;
            }
        }, r.a());
    }

    @Override // com.bytedance.lighten.a.c.k
    public final void a(Uri uri, View view, Throwable th) {
        if (!a()) {
            final long currentTimeMillis = System.currentTimeMillis() - this.f93606d;
            final boolean aq = this.f93603a.get().aq();
            i.b(new Callable<Object>() {
                /* class com.ss.android.ugc.aweme.feed.n.j.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(59558);
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    int i2;
                    MobClick labelName = MobClick.obtain().setEventName("image_request_response").setValue(j.this.f93604b.getAid()).setLabelName("perf_monitor");
                    s a2 = new s().a("request_id", j.this.f93603a.get().ap().optString("request_id"));
                    if (!aq) {
                        i2 = 2;
                    } else {
                        i2 = 0;
                    }
                    r.onEvent(labelName.setJsonObject(a2.a("is_success", String.valueOf(i2)).a("duration", String.valueOf(currentTimeMillis)).a("internet_speed", String.valueOf((int) b.a.f48731a.b())).a("is_cache", String.valueOf(e.a(Uri.parse(j.this.f93605c.getOriginCover().getUrlList().get(0))) ? 1 : 0)).a()));
                    return null;
                }
            }, r.a());
        }
    }

    @Override // com.bytedance.lighten.a.c.k
    public final void a(Uri uri, View view, o oVar, Animatable animatable) {
        a.b.f109011a.b("feed_cover_total", false);
        com.ss.android.ugc.aweme.feed.helper.d dVar = this.f93607e;
        if (dVar != null) {
            dVar.f93324a = SystemClock.elapsedRealtime();
        }
        if (!a()) {
            final long currentTimeMillis = System.currentTimeMillis() - this.f93606d;
            final boolean aq = this.f93603a.get().aq();
            i.b(new Callable<Object>() {
                /* class com.ss.android.ugc.aweme.feed.n.j.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(59557);
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    int i2;
                    if (j.this.a()) {
                        return null;
                    }
                    MobClick labelName = MobClick.obtain().setEventName("image_request_response").setValue(j.this.f93604b.getAid()).setLabelName("perf_monitor");
                    s a2 = new s().a("request_id", j.this.f93603a.get().ap().optString("request_id"));
                    if (!aq) {
                        i2 = 2;
                    } else {
                        i2 = 1;
                    }
                    r.onEvent(labelName.setJsonObject(a2.a("is_success", String.valueOf(i2)).a("duration", String.valueOf(currentTimeMillis)).a("internet_speed", String.valueOf((int) b.a.f48731a.b())).a("is_cache", String.valueOf(e.a(Uri.parse(j.this.f93605c.getOriginCover().getUrlList().get(0))) ? 1 : 0)).a()));
                    return null;
                }
            }, r.a());
        }
    }
}
