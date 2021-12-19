package com.ss.android.ugc.aweme.newfollow.ui;

import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.ui.NoticeView;
import com.ss.android.ugc.aweme.global.config.settings.c;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static int f112620a = 3;

    /* renamed from: b  reason: collision with root package name */
    public static int f112621b = 15;

    /* renamed from: c  reason: collision with root package name */
    public NoticeView f112622c;

    /* renamed from: d  reason: collision with root package name */
    public Context f112623d;

    /* renamed from: e  reason: collision with root package name */
    public b f112624e;

    /* renamed from: f  reason: collision with root package name */
    public a f112625f = a.Message;

    public interface b {
        static {
            Covode.recordClassIndex(72375);
        }

        boolean a(Context context);

        void b(Context context);
    }

    static {
        Covode.recordClassIndex(72372);
    }

    public final long b() {
        return com.ss.android.ugc.aweme.co.b.b().e(this.f112623d, "key_cross_push_notification_guide");
    }

    public final long c() {
        return com.ss.android.ugc.aweme.co.b.b().e(this.f112623d, "key_times_push_notification_guide");
    }

    public enum a {
        Message,
        Follow;

        static {
            Covode.recordClassIndex(72374);
        }
    }

    public final void a() {
        b bVar;
        Context context = this.f112623d;
        if (context != null && this.f112622c != null && (bVar = this.f112624e) != null) {
            bVar.a(context);
            if (!this.f112624e.a(this.f112623d)) {
                long b2 = b();
                System.currentTimeMillis();
                c();
                if (System.currentTimeMillis() - b2 <= ((long) f112621b) * 86400000 || c() >= ((long) f112620a)) {
                    this.f112622c.setVisibility(8);
                    return;
                }
                this.f112622c.setVisibility(0);
                if (this.f112625f == a.Follow) {
                    r.a("notification_setting_alert_show", new d().a("enter_from", "follow").f66730a);
                } else {
                    r.a("notification_setting_alert_show", new d().a("enter_from", "message").f66730a);
                }
            } else {
                this.f112622c.setVisibility(8);
            }
        }
    }

    public e(NoticeView noticeView, b bVar) {
        this.f112622c = noticeView;
        noticeView.setVisibility(8);
        this.f112624e = bVar;
        NoticeView noticeView2 = this.f112622c;
        if (!(noticeView2 == null || bVar == null)) {
            Context context = noticeView2.getContext();
            this.f112623d = context;
            NoticeView noticeView3 = this.f112622c;
            if (!(noticeView3 == null || context == null)) {
                noticeView3.setOnInternalClickListener(new NoticeView.a() {
                    /* class com.ss.android.ugc.aweme.newfollow.ui.e.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(72373);
                    }

                    @Override // com.ss.android.ugc.aweme.discover.ui.NoticeView.a
                    public final void a() {
                        e.this.f112622c.setVisibility(8);
                        e eVar = e.this;
                        if (eVar.f112624e != null) {
                            try {
                                eVar.f112624e.b(eVar.f112623d);
                            } catch (Exception unused) {
                                Context context = eVar.f112623d;
                                Intent intent = new Intent("android.settings.SETTINGS");
                                com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
                                context.startActivity(intent);
                            }
                        }
                        e.this.c();
                        e.this.b();
                        if (e.this.f112625f == a.Follow) {
                            r.a("notification_setting_alert_click", new d().a("enter_from", "follow").f66730a);
                        } else {
                            r.a("notification_setting_alert_click", new d().a("enter_from", "message").f66730a);
                        }
                    }

                    @Override // com.ss.android.ugc.aweme.discover.ui.NoticeView.a
                    public final void b() {
                        e.this.f112622c.setVisibility(8);
                        com.ss.android.ugc.aweme.co.b.b().a(e.this.f112623d, "key_cross_push_notification_guide", Long.valueOf(System.currentTimeMillis()).longValue());
                        e eVar = e.this;
                        com.ss.android.ugc.aweme.co.b.b().a(eVar.f112623d, "key_times_push_notification_guide", Long.valueOf(eVar.c() + 1).longValue());
                        e.this.c();
                        e.this.b();
                        if (e.this.f112625f == a.Follow) {
                            r.a("notification_setting_alert_close", new d().a("enter_from", "follow").f66730a);
                        } else {
                            r.a("notification_setting_alert_close", new d().a("enter_from", "message").f66730a);
                        }
                    }
                });
            }
        }
        try {
            f112620a = c.f99077a.f99078b.getPushGuideInfo().getCloseCountLimit().intValue();
            f112621b = c.f99077a.f99078b.getPushGuideInfo().getShowupInterval().intValue();
        } catch (Exception e2) {
            e2.printStackTrace();
            f112620a = 3;
            f112621b = 15;
        }
    }
}
