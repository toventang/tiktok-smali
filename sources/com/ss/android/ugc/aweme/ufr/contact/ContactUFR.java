package com.ss.android.ugc.aweme.ufr.contact;

import android.content.Context;
import androidx.lifecycle.i;
import androidx.lifecycle.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpermissions.i;
import com.bytedance.ies.powerpermissions.j;
import com.bytedance.ies.powerpermissions.l;
import com.bytedance.ies.powerpermissions.m;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.experiment.ew;
import com.ss.android.ugc.aweme.friends.model.BackFromSettingEvent;
import com.ss.android.ugc.aweme.profile.model.SocialPlatformSetting;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.ufr.c;
import com.ss.android.ugc.aweme.ufr.contact.a;
import com.ss.android.ugc.aweme.utils.be;
import com.zhiliaoapp.musically.R;
import f.a.t;
import f.a.v;
import f.a.w;
import h.f.b.l;
import h.z;
import java.util.List;
import java.util.Objects;

public final class ContactUFR extends com.ss.android.ugc.aweme.ufr.a implements k {

    /* renamed from: j  reason: collision with root package name */
    public static final a f141663j = new a((byte) 0);

    /* renamed from: h  reason: collision with root package name */
    public f.a.b.b f141664h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f141665i;

    /* renamed from: k  reason: collision with root package name */
    private final f.a.b.a f141666k = new f.a.b.a();

    static {
        Covode.recordClassIndex(92582);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(92583);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.ufr.a
    public final t<com.ss.android.ugc.aweme.ufr.e> g() {
        t<com.ss.android.ugc.aweme.ufr.e> a2 = t.a(new c(this));
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.ufr.a
    public final t<com.ss.android.ugc.aweme.ufr.e> i() {
        t<com.ss.android.ugc.aweme.ufr.e> a2 = t.a(new h(this));
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.ufr.a
    public final t<com.ss.android.ugc.aweme.ufr.e> f() {
        boolean z;
        if (androidx.core.content.b.a(com.bytedance.ies.ugc.appcontext.d.a(), "android.permission.READ_CONTACTS") != -1) {
            z = true;
        } else {
            z = false;
        }
        t<com.ss.android.ugc.aweme.ufr.e> b2 = t.b(new com.ss.android.ugc.aweme.ufr.e(z, 0, 0, null, 14));
        l.b(b2, "");
        return b2;
    }

    @Override // com.ss.android.ugc.aweme.ufr.a
    public final t<com.ss.android.ugc.aweme.ufr.e> h() {
        boolean z;
        if (!this.f141631f || !l.a((Object) "version_update", (Object) c())) {
            z = false;
        } else {
            z = true;
        }
        t<com.ss.android.ugc.aweme.ufr.e> a2 = t.a(new b(this, z));
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.ufr.a
    public final t<com.ss.android.ugc.aweme.ufr.e> e() {
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        User curUser = g2.getCurUser();
        l.b(curUser, "");
        List<SocialPlatformSetting> socialPlatformSettings = curUser.getSocialData().getSocialPlatformSettings();
        if (socialPlatformSettings != null) {
            for (SocialPlatformSetting socialPlatformSetting : socialPlatformSettings) {
                if (socialPlatformSetting.getSocialPlatform() == 1) {
                    t<com.ss.android.ugc.aweme.ufr.e> b2 = t.b(new com.ss.android.ugc.aweme.ufr.e(socialPlatformSetting.getSyncStatus(), 0, 0, null, 14));
                    l.b(b2, "");
                    return b2;
                }
            }
        }
        t<com.ss.android.ugc.aweme.ufr.e> b3 = t.b(new com.ss.android.ugc.aweme.ufr.e(false, 0, 0, null, 14));
        l.b(b3, "");
        return b3;
    }

    static final class b<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ContactUFR f141667a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f141668b;

        static {
            Covode.recordClassIndex(92584);
        }

        b(ContactUFR contactUFR, boolean z) {
            this.f141667a = contactUFR;
            this.f141668b = z;
        }

        @Override // f.a.w
        public final void subscribe(final v<com.ss.android.ugc.aweme.ufr.e> vVar) {
            l.d(vVar, "");
            l.a aVar = com.bytedance.ies.powerpermissions.l.f34469d;
            Context a2 = this.f141667a.a();
            Objects.requireNonNull(a2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            aVar.a((androidx.fragment.app.e) a2, null).a("android.permission.READ_CONTACTS").a(new i(this) {
                /* class com.ss.android.ugc.aweme.ufr.contact.ContactUFR.b.AnonymousClass1 */

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ b f141669b;

                static {
                    Covode.recordClassIndex(92585);
                }

                {
                    this.f141669b = r1;
                }

                /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: f.a.v */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.bytedance.ies.powerpermissions.i
                public final void a(m mVar, com.bytedance.ies.powerpermissions.c.a... aVarArr) {
                    h.f.b.l.d(aVarArr, "");
                    int i2 = b.f141687a[aVarArr[0].f34455b.ordinal()];
                    if (i2 == 1) {
                        vVar.a(new com.ss.android.ugc.aweme.ufr.e(true, 0, 0, null, 14));
                        if (mVar != null) {
                            mVar.b();
                        }
                    } else if (i2 != 2) {
                        if (i2 == 3) {
                            ContactUFR contactUFR = this.f141669b.f141667a;
                            v vVar = vVar;
                            h.f.b.l.b(vVar, "");
                            com.bytedance.tux.dialog.b bVar = new com.bytedance.tux.dialog.b(contactUFR.a());
                            com.ss.android.ugc.aweme.friends.e.a.a(contactUFR.c(), "guide", "contact", contactUFR.d(), "off", com.ss.android.ugc.aweme.friends.e.a.b(), contactUFR.f141630e);
                            ((com.bytedance.tux.dialog.b) com.bytedance.tux.dialog.b.c.a((com.bytedance.tux.dialog.b) bVar.b(ew.a()).b(R.string.erh), new d(contactUFR, vVar)).a(false)).a().b().show();
                            if (mVar != null) {
                                mVar.b();
                            }
                        }
                    } else if (this.f141669b.f141668b) {
                        com.ss.android.ugc.aweme.friends.e.a.a(this.f141669b.f141667a.c(), "system", "contact", this.f141669b.f141667a.d(), "unknown", com.ss.android.ugc.aweme.friends.e.a.b(), this.f141669b.f141667a.f141630e);
                        if (mVar != null) {
                            mVar.a();
                        }
                    } else {
                        ContactUFR contactUFR2 = this.f141669b.f141667a;
                        v vVar2 = vVar;
                        h.f.b.l.b(vVar2, "");
                        com.ss.android.ugc.aweme.friends.e.a.a(contactUFR2.c(), "authorize", "contact", contactUFR2.d(), "unknown", com.ss.android.ugc.aweme.friends.e.a.b(), contactUFR2.f141630e);
                        ((com.bytedance.tux.dialog.b) com.bytedance.tux.dialog.b.c.a(new com.bytedance.tux.dialog.b(contactUFR2.a()).b(ew.a()).d(ew.d()), new e(contactUFR2, mVar, vVar2)).a(false)).a().b().show();
                    }
                }
            }).a(new com.bytedance.ies.powerpermissions.f(this) {
                /* class com.ss.android.ugc.aweme.ufr.contact.ContactUFR.b.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f141671a;

                static {
                    Covode.recordClassIndex(92586);
                }

                /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: f.a.v */
                /* JADX DEBUG: Multi-variable search result rejected for r0v20, resolved type: f.a.v */
                /* JADX DEBUG: Multi-variable search result rejected for r0v28, resolved type: f.a.v */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.bytedance.ies.powerpermissions.f
                public final void a(com.bytedance.ies.powerpermissions.c.a... aVarArr) {
                    h.f.b.l.d(aVarArr, "");
                    int i2 = b.f141688b[aVarArr[0].f34455b.ordinal()];
                    if (i2 == 1) {
                        com.ss.android.ugc.aweme.friends.e.a.a(this.f141671a.f141667a.c(), "system", "contact", true, false, this.f141671a.f141667a.d(), "unknown", com.ss.android.ugc.aweme.friends.e.a.b(), this.f141671a.f141667a.f141630e, 16);
                        vVar.a(new com.ss.android.ugc.aweme.ufr.e(true, 0, 0, null, 14));
                    } else if (i2 == 2) {
                        com.ss.android.ugc.aweme.friends.e.a.a(this.f141671a.f141667a.c(), "system", "contact", false, false, this.f141671a.f141667a.d(), "unknown", com.ss.android.ugc.aweme.friends.e.a.b(), this.f141671a.f141667a.f141630e, 16);
                        vVar.a(new com.ss.android.ugc.aweme.ufr.e(false, 0, 0, null, 14));
                    } else if (i2 == 3) {
                        com.ss.android.ugc.aweme.friends.e.a.a(this.f141671a.f141667a.c(), "system", "contact", false, false, this.f141671a.f141667a.d(), "off", com.ss.android.ugc.aweme.friends.e.a.b(), this.f141671a.f141667a.f141630e);
                        vVar.a(new com.ss.android.ugc.aweme.ufr.e(false, 0, 0, null, 14));
                    }
                }

                {
                    this.f141671a = r1;
                }
            });
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ f.a.g $emitter;
        final /* synthetic */ ContactUFR this$0;

        static {
            Covode.recordClassIndex(92588);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(ContactUFR contactUFR, f.a.g gVar) {
            super(1);
            this.this$0 = contactUFR;
            this.$emitter = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            bVar2.a(R.string.frq, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.ufr.contact.ContactUFR.d.AnonymousClass1 */
                final /* synthetic */ d this$0;

                static {
                    Covode.recordClassIndex(92589);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    h.f.b.l.d(aVar, "");
                    if (h.f.b.l.a((Object) this.this$0.this$0.c(), (Object) "privacy_setting")) {
                        new BackFromSettingEvent("privacy_setting").post();
                    }
                    Context a2 = this.this$0.this$0.a();
                    if (!(a2 instanceof androidx.fragment.app.e)) {
                        a2 = null;
                    }
                    androidx.core.app.d dVar = (androidx.core.app.d) a2;
                    if (dVar != null && (!this.this$0.this$0.f141665i)) {
                        dVar.getLifecycle().a(this.this$0.this$0);
                        this.this$0.this$0.f141665i = true;
                    }
                    Context a3 = this.this$0.this$0.a();
                    h.f.b.l.c(a3, "");
                    j.b(a3, j.b(a3));
                    com.ss.android.ugc.aweme.friends.e.a.a(this.this$0.this$0.c(), "guide", "contact", true, false, this.this$0.this$0.d(), "off", com.ss.android.ugc.aweme.friends.e.a.b(), this.this$0.this$0.f141630e, 16);
                    IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                    h.f.b.l.b(g2, "");
                    User curUser = g2.getCurUser();
                    h.f.b.l.b(curUser, "");
                    Keva.getRepo("cold_boot_for_fb_and_ctx").storeBoolean("click_contact_open_setting".concat(String.valueOf(curUser.getUid())), true);
                    this.this$0.$emitter.a(new com.ss.android.ugc.aweme.ufr.e(false, 1, 0, null, 12));
                    return z.f158842a;
                }
            });
            bVar2.b(ew.f(), new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.ufr.contact.ContactUFR.d.AnonymousClass2 */
                final /* synthetic */ d this$0;

                static {
                    Covode.recordClassIndex(92590);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    h.f.b.l.d(aVar, "");
                    com.ss.android.ugc.aweme.friends.e.a.a(this.this$0.this$0.c(), "guide", "contact", false, false, this.this$0.this$0.d(), "off", com.ss.android.ugc.aweme.friends.e.a.b(), this.this$0.this$0.f141630e, 16);
                    this.this$0.$emitter.a(new com.ss.android.ugc.aweme.ufr.e(false, 0, 0, null, 14));
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    static final class e extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ m $dispatcher;
        final /* synthetic */ f.a.g $emitter;
        final /* synthetic */ ContactUFR this$0;

        static {
            Covode.recordClassIndex(92591);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(ContactUFR contactUFR, m mVar, f.a.g gVar) {
            super(1);
            this.this$0 = contactUFR;
            this.$dispatcher = mVar;
            this.$emitter = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            bVar2.a(ew.e(), new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.ufr.contact.ContactUFR.e.AnonymousClass1 */
                final /* synthetic */ e this$0;

                static {
                    Covode.recordClassIndex(92592);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    h.f.b.l.d(aVar, "");
                    com.ss.android.ugc.aweme.friends.e.a.a(this.this$0.this$0.c(), "system", "contact", this.this$0.this$0.d(), "unknown", com.ss.android.ugc.aweme.friends.e.a.b(), this.this$0.this$0.f141630e);
                    com.ss.android.ugc.aweme.friends.e.a.a(this.this$0.this$0.c(), "authorize", "contact", true, false, this.this$0.this$0.d(), "unknown", com.ss.android.ugc.aweme.friends.e.a.b(), this.this$0.this$0.f141630e, 16);
                    m mVar = this.this$0.$dispatcher;
                    if (mVar != null) {
                        mVar.a();
                    }
                    return z.f158842a;
                }
            });
            bVar2.b(ew.f(), new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.ufr.contact.ContactUFR.e.AnonymousClass2 */
                final /* synthetic */ e this$0;

                static {
                    Covode.recordClassIndex(92593);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    h.f.b.l.d(aVar, "");
                    com.ss.android.ugc.aweme.friends.e.a.a(this.this$0.this$0.c(), "authorize", "contact", false, false, this.this$0.this$0.d(), "unknown", com.ss.android.ugc.aweme.friends.e.a.b(), this.this$0.this$0.f141630e, 16);
                    m mVar = this.this$0.$dispatcher;
                    if (mVar != null) {
                        mVar.b();
                    }
                    this.this$0.$emitter.a(new com.ss.android.ugc.aweme.ufr.e(false, 0, 0, null, 14));
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    static final class f extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ f.a.g $emitter;
        final /* synthetic */ ContactUFR this$0;

        static {
            Covode.recordClassIndex(92594);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(ContactUFR contactUFR, f.a.g gVar) {
            super(1);
            this.this$0 = contactUFR;
            this.$emitter = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            bVar2.a(ew.e(), new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.ufr.contact.ContactUFR.f.AnonymousClass1 */
                final /* synthetic */ f this$0;

                static {
                    Covode.recordClassIndex(92595);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    h.f.b.l.d(aVar, "");
                    com.ss.android.ugc.aweme.friends.e.a.a(this.this$0.this$0.c(), "user", "contact", true, false, this.this$0.this$0.d(), "on", "off", this.this$0.this$0.f141630e, 16);
                    this.this$0.$emitter.a(new com.ss.android.ugc.aweme.ufr.e(true, 0, 0, null, 14));
                    return z.f158842a;
                }
            });
            bVar2.b(ew.f(), new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.ufr.contact.ContactUFR.f.AnonymousClass2 */
                final /* synthetic */ f this$0;

                static {
                    Covode.recordClassIndex(92596);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    h.f.b.l.d(aVar, "");
                    com.ss.android.ugc.aweme.friends.e.a.a(this.this$0.this$0.c(), "user", "contact", false, false, this.this$0.this$0.d(), "on", "off", this.this$0.this$0.f141630e, 16);
                    this.this$0.$emitter.a(new com.ss.android.ugc.aweme.ufr.e(false, 0, 0, null, 14));
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    static final class g<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ContactUFR f141674a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f141675b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f141676c;

        static {
            Covode.recordClassIndex(92597);
        }

        g(ContactUFR contactUFR, boolean z, int i2) {
            this.f141674a = contactUFR;
            this.f141675b = z;
            this.f141676c = i2;
        }

        @Override // f.a.w
        public final void subscribe(final v<com.ss.android.ugc.aweme.ufr.e> vVar) {
            h.f.b.l.d(vVar, "");
            this.f141674a.f141664h = com.ss.android.ugc.aweme.friends.api.a.a().syncSocialRelationStatusInRx(1, Boolean.valueOf(this.f141675b)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new f.a.d.f(this) {
                /* class com.ss.android.ugc.aweme.ufr.contact.ContactUFR.g.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ g f141677a;

                static {
                    Covode.recordClassIndex(92598);
                }

                {
                    this.f141677a = r1;
                }

                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: f.a.v */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // f.a.d.f
                public final /* synthetic */ void accept(Object obj) {
                    String str;
                    String str2;
                    vVar.a(new com.ss.android.ugc.aweme.ufr.e(this.f141677a.f141675b, 0, 0, null, 14));
                    com.ss.android.ugc.aweme.ufr.f.a(com.ss.android.ugc.aweme.recommend.f.CONTACT);
                    if (this.f141677a.f141675b) {
                        String c2 = this.f141677a.f141674a.c();
                        if (this.f141677a.f141676c == 1) {
                            str = "system";
                        } else {
                            str = "user";
                        }
                        int i2 = this.f141677a.f141676c;
                        if (i2 == 1) {
                            str2 = "both";
                        } else if (i2 != 2) {
                            str2 = "did";
                        } else {
                            str2 = "uid";
                        }
                        com.ss.android.ugc.aweme.friends.e.a.b(c2, str, "contact", this.f141677a.f141674a.d(), str2, "process", this.f141677a.f141674a.f141630e);
                    }
                    f.a.b.b bVar = this.f141677a.f141674a.f141664h;
                    if (bVar != null) {
                        bVar.dispose();
                    }
                }
            }, new f.a.d.f(this) {
                /* class com.ss.android.ugc.aweme.ufr.contact.ContactUFR.g.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ g f141679a;

                static {
                    Covode.recordClassIndex(92599);
                }

                {
                    this.f141679a = r1;
                }

                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: f.a.v */
                /* JADX WARN: Multi-variable type inference failed */
                /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
                    java.lang.IndexOutOfBoundsException: Index 7 out of bounds for length 7
                    	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
                    	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
                    	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
                    	at java.base/java.util.Objects.checkIndex(Objects.java:359)
                    	at java.base/java.util.ArrayList.get(ArrayList.java:427)
                    	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
                    	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
                    	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
                    	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
                    	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
                    */
                @Override // f.a.d.f
                public final /* synthetic */ void accept(java.lang.Object r11) {
                    /*
                    // Method dump skipped, instructions count: 121
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ufr.contact.ContactUFR.g.AnonymousClass2.accept(java.lang.Object):void");
                }
            });
        }
    }

    static final class c<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ContactUFR f141673a;

        static {
            Covode.recordClassIndex(92587);
        }

        c(ContactUFR contactUFR) {
            this.f141673a = contactUFR;
        }

        @Override // f.a.w
        public final void subscribe(v<com.ss.android.ugc.aweme.ufr.e> vVar) {
            h.f.b.l.d(vVar, "");
            ContactUFR contactUFR = this.f141673a;
            com.ss.android.ugc.aweme.friends.e.a.a(contactUFR.c(), "user", "contact", contactUFR.d(), "on", "off", contactUFR.f141630e);
            ((com.bytedance.tux.dialog.b) com.bytedance.tux.dialog.b.c.a(new com.bytedance.tux.dialog.b(contactUFR.a()).b(ew.a()).d(ew.d()), new f(contactUFR, vVar)).a(false)).a().b().show();
        }
    }

    static final class h<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ContactUFR f141681a;

        static {
            Covode.recordClassIndex(92600);
        }

        h(ContactUFR contactUFR) {
            this.f141681a = contactUFR;
        }

        @Override // f.a.w
        public final void subscribe(final v<com.ss.android.ugc.aweme.ufr.e> vVar) {
            int i2;
            h.f.b.l.d(vVar, "");
            String c2 = this.f141681a.c();
            if (c2.hashCode() == -667094460 && c2.equals("homepage_friends")) {
                i2 = 8;
            } else {
                i2 = 1;
            }
            a.C3767a aVar = new a.C3767a(i2);
            f.a.e.b.b.a((Object) aVar, "source is null");
            f.a.b a2 = f.a.h.a.a(new f.a.e.e.a.a(aVar));
            h.f.b.l.b(a2, "");
            a2.b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new f.a.d.a() {
                /* class com.ss.android.ugc.aweme.ufr.contact.ContactUFR.h.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(92601);
                }

                /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: f.a.v */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // f.a.d.a
                public final void a() {
                    vVar.a(new com.ss.android.ugc.aweme.ufr.e(true, 0, 0, null, 14));
                }
            }, new f.a.d.f() {
                /* class com.ss.android.ugc.aweme.ufr.contact.ContactUFR.h.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(92602);
                }

                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: f.a.v */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // f.a.d.f
                public final /* synthetic */ void accept(Object obj) {
                    int i2;
                    Throwable th = (Throwable) obj;
                    v vVar = vVar;
                    if (!(th instanceof com.ss.android.ugc.aweme.base.api.a.b.a)) {
                        th = null;
                    }
                    com.ss.android.ugc.aweme.base.api.a.a aVar = (com.ss.android.ugc.aweme.base.api.a.a) th;
                    if (aVar != null) {
                        i2 = aVar.getErrorCode();
                    } else {
                        i2 = -1;
                    }
                    vVar.a(new com.ss.android.ugc.aweme.ufr.e(false, 0, i2, null, 10));
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.ufr.a
    public final t<com.ss.android.ugc.aweme.ufr.e> a(boolean z, int i2) {
        c.a.a(z);
        t<com.ss.android.ugc.aweme.ufr.e> a2 = t.a(new g(this, z, i2));
        h.f.b.l.b(a2, "");
        return a2;
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
        h.f.b.l.d(mVar, "");
        h.f.b.l.d(aVar, "");
        if (this.f141665i && aVar == i.a.ON_RESUME && be.a(a())) {
            this.f141665i = false;
            if (!h.f.b.l.a((Object) c(), (Object) "privacy_setting") && !h.f.b.l.a((Object) c(), (Object) "find_friends_page")) {
                ((com.ss.android.ugc.aweme.friends.a) com.ss.android.ugc.aweme.base.b.a.b.a(a(), com.ss.android.ugc.aweme.friends.a.class)).a(false);
                t<com.ss.android.ugc.aweme.ufr.e> b2 = a(true, 0).b(f.a.h.a.b(f.a.k.a.f158006c));
                f.a.d.f<? super com.ss.android.ugc.aweme.ufr.e> fVar = f.a.e.b.a.f157191d;
                f.a.b.b a2 = b2.a(fVar, (f.a.d.f<? super Throwable>) fVar);
                h.f.b.l.b(a2, "");
                f.a.j.a.a(a2, this.f141666k);
                if (this.f141632g) {
                    t<com.ss.android.ugc.aweme.ufr.e> b3 = i().b(f.a.h.a.b(f.a.k.a.f158006c));
                    f.a.d.f<? super com.ss.android.ugc.aweme.ufr.e> fVar2 = f.a.e.b.a.f157191d;
                    f.a.b.b a3 = b3.a(fVar2, (f.a.d.f<? super Throwable>) fVar2);
                    h.f.b.l.b(a3, "");
                    f.a.j.a.a(a3, this.f141666k);
                }
            }
        } else if (aVar == i.a.ON_DESTROY) {
            this.f141666k.dispose();
            mVar.getLifecycle().b(this);
        }
    }
}
