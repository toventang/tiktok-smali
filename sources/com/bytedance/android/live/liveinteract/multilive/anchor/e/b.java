package com.bytedance.android.live.liveinteract.multilive.anchor.e;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.at.k;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import f.a.d.f;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final f.a.b.a f11628a = new f.a.b.a();

    /* renamed from: b  reason: collision with root package name */
    public static final b f11629b = new b();

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.e.b$b  reason: collision with other inner class name */
    public static final class C0238b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f11631a;

        static {
            Covode.recordClassIndex(6324);
        }

        public C0238b(a aVar) {
            this.f11631a = aVar;
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    private b() {
    }

    static {
        Covode.recordClassIndex(6322);
    }

    public static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f11630a;

        static {
            Covode.recordClassIndex(6323);
        }

        public a(a aVar) {
            this.f11630a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f11630a.a((com.bytedance.android.livesdkapi.depend.model.b.a) obj);
        }
    }

    public static final class d implements LiveDialog.b {

        /* renamed from: a  reason: collision with root package name */
        public static final d f11638a = new d();

        static {
            Covode.recordClassIndex(6328);
        }

        d() {
        }

        @Override // com.bytedance.android.live.design.app.LiveDialog.b
        public final void a(DialogInterface dialogInterface) {
            l.d(dialogInterface, "");
            dialogInterface.dismiss();
        }
    }

    public static final class c implements LiveDialog.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f11632a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ User f11633b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Room f11634c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a f11635d;

        static {
            Covode.recordClassIndex(6325);
        }

        public c(Context context, User user, Room room, a aVar) {
            this.f11632a = context;
            this.f11633b = user;
            this.f11634c = room;
            this.f11635d = aVar;
        }

        @Override // com.bytedance.android.live.design.app.LiveDialog.b
        public final void a(DialogInterface dialogInterface) {
            Activity activity;
            l.d(dialogInterface, "");
            dialogInterface.dismiss();
            k.c cVar = new k.c();
            Context context = this.f11632a;
            while (true) {
                activity = null;
                if (context != null) {
                    if (!(context instanceof Activity)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        activity = (Activity) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            k.a a2 = ((k.a) cVar.a(activity).a(this.f11633b.getId())).b(this.f11634c.getId()).a("");
            FollowInfo followInfo = this.f11633b.getFollowInfo();
            l.b(followInfo, "");
            b.f11628a.a(u.a().b().a(new k(a2.a((int) followInfo.getFollowStatus()))).a(new f(this) {
                /* class com.bytedance.android.live.liveinteract.multilive.anchor.e.b.c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c f11636a;

                static {
                    Covode.recordClassIndex(6326);
                }

                {
                    this.f11636a = r1;
                }

                @Override // f.a.d.f
                public final /* synthetic */ void accept(Object obj) {
                    this.f11636a.f11635d.a((com.bytedance.android.livesdkapi.depend.model.b.a) obj);
                }
            }, new f(this) {
                /* class com.bytedance.android.live.liveinteract.multilive.anchor.e.b.c.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c f11637a;

                static {
                    Covode.recordClassIndex(6327);
                }

                {
                    this.f11637a = r1;
                }

                @Override // f.a.d.f
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            }));
        }
    }
}
