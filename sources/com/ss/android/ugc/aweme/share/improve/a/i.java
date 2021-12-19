package com.ss.android.ugc.aweme.share.improve.a;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.i.s;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.feed.x.m;
import com.ss.android.ugc.aweme.framework.services.IRetrofit;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.services.RetrofitService;
import com.ss.android.ugc.aweme.share.business.tcm.TCMOrderDeleteApi;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.ss.android.ugc.aweme.share.m.j;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.h;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import f.a.t;
import h.f.b.l;
import java.lang.ref.WeakReference;

public final class i implements h {

    /* renamed from: d  reason: collision with root package name */
    public static final a f123734d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final TCMOrderDeleteApi f123735a;

    /* renamed from: b  reason: collision with root package name */
    public final WeakReference<s<ag>> f123736b;

    /* renamed from: c  reason: collision with root package name */
    public final String f123737c;

    /* renamed from: e  reason: collision with root package name */
    private final String f123738e;

    static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final c f123753a = new c();

        static {
            Covode.recordClassIndex(81227);
        }

        c() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(81214);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int b() {
        return R.string.b5g;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final String c() {
        return "delete";
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int ch_() {
        return R.raw.icon_2pt_trash_bin;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean d() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean e() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final boolean f() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final int g() {
        return R.raw.icon_trash_bin;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81215);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context) {
        l.d(context, "");
        l.d(context, "");
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(ImageView imageView) {
        l.d(imageView, "");
        l.d(imageView, "");
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(TextView textView) {
        l.d(textView, "");
        h.a.a(this, textView);
    }

    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f123739a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Aweme f123740b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f123741c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f123742d;

        static {
            Covode.recordClassIndex(81216);
        }

        b(i iVar, Aweme aweme, Context context, String str) {
            this.f123739a = iVar;
            this.f123740b = aweme;
            this.f123741c = context;
            this.f123742d = str;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            final com.ss.android.ugc.aweme.share.business.tcm.a aVar = (com.ss.android.ugc.aweme.share.business.tcm.a) obj;
            int i2 = aVar.f123412a;
            if (i2 != 1) {
                if (i2 == 2) {
                    a.C0731a aVar2 = new a.C0731a(this.f123741c);
                    aVar2.E = true;
                    aVar2.b(R.string.b6a);
                    aVar2.b(R.string.a9f, (DialogInterface.OnClickListener) AnonymousClass3.f123745a, false).a(R.string.fds, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(this) {
                        /* class com.ss.android.ugc.aweme.share.improve.a.i.b.AnonymousClass4 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ b f123746a;

                        static {
                            Covode.recordClassIndex(81220);
                        }

                        {
                            this.f123746a = r1;
                        }

                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            t<BaseResponse> a2;
                            TCMOrderDeleteApi tCMOrderDeleteApi = this.f123746a.f123739a.f123735a;
                            String valueOf = String.valueOf(this.f123746a.f123740b.getStarAtlasOrderId());
                            String aid = this.f123746a.f123740b.getAid();
                            l.b(aid, "");
                            t<BaseResponse> b2 = tCMOrderDeleteApi.applyDeleteTCMOrder(valueOf, aid).b(f.a.h.a.b(f.a.k.a.f158006c));
                            if (!(b2 == null || (a2 = b2.a(f.a.a.a.a.a(f.a.a.b.a.f157156a))) == null)) {
                                a2.a(new f(this) {
                                    /* class com.ss.android.ugc.aweme.share.improve.a.i.b.AnonymousClass4.AnonymousClass1 */

                                    /* renamed from: a  reason: collision with root package name */
                                    final /* synthetic */ AnonymousClass4 f123747a;

                                    static {
                                        Covode.recordClassIndex(81221);
                                    }

                                    {
                                        this.f123747a = r1;
                                    }

                                    @Override // f.a.d.f
                                    public final /* synthetic */ void accept(Object obj) {
                                        new com.ss.android.ugc.aweme.tux.a.i.a(this.f123747a.f123746a.f123741c).a(R.string.gj7).a();
                                    }
                                }, new f(this) {
                                    /* class com.ss.android.ugc.aweme.share.improve.a.i.b.AnonymousClass4.AnonymousClass2 */

                                    /* renamed from: a  reason: collision with root package name */
                                    final /* synthetic */ AnonymousClass4 f123748a;

                                    static {
                                        Covode.recordClassIndex(81222);
                                    }

                                    {
                                        this.f123748a = r1;
                                    }

                                    @Override // f.a.d.f
                                    public final /* synthetic */ void accept(Object obj) {
                                        new com.ss.android.ugc.aweme.tux.a.i.a(this.f123748a.f123746a.f123741c).a(R.string.gj6).a();
                                    }
                                });
                            }
                            dialogInterface.dismiss();
                        }
                    }, false).a().c();
                } else if (i2 == 3) {
                    a.C0731a aVar3 = new a.C0731a(this.f123741c);
                    aVar3.E = true;
                    aVar3.b(R.string.b64);
                    aVar3.b(R.string.ah1, (DialogInterface.OnClickListener) AnonymousClass5.f123749a, false).a(R.string.hcf, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                        /* class com.ss.android.ugc.aweme.share.improve.a.i.b.AnonymousClass6 */

                        static {
                            Covode.recordClassIndex(81224);
                        }

                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            com.ss.android.ugc.aweme.ck.t a2 = com.ss.android.ugc.aweme.ck.t.a();
                            if (a2 != null) {
                                com.ss.android.ugc.aweme.ck.t.a(a2, aVar.f123413b);
                            }
                            dialogInterface.dismiss();
                        }
                    }, false).a().c();
                } else if (i2 == 4) {
                    a.C0731a aVar4 = new a.C0731a(this.f123741c);
                    aVar4.E = true;
                    aVar4.b(R.string.b6_);
                    aVar4.b(R.string.ah1, (DialogInterface.OnClickListener) AnonymousClass7.f123751a, false).a(R.string.hcf, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                        /* class com.ss.android.ugc.aweme.share.improve.a.i.b.AnonymousClass8 */

                        static {
                            Covode.recordClassIndex(81226);
                        }

                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            com.ss.android.ugc.aweme.ck.t a2 = com.ss.android.ugc.aweme.ck.t.a();
                            if (a2 != null) {
                                com.ss.android.ugc.aweme.ck.t.a(a2, aVar.f123413b);
                            }
                            dialogInterface.dismiss();
                        }
                    }, false).a().c();
                }
            } else if (!j.a(this.f123740b) || !m.a(this.f123740b)) {
                aw.a(this.f123740b);
            } else {
                a.C0731a aVar5 = new a.C0731a(this.f123741c);
                aVar5.E = true;
                aVar5.b(R.string.b5q);
                aVar5.b(R.string.a9f, (DialogInterface.OnClickListener) AnonymousClass1.f123743a, false).a(R.string.asg, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(this) {
                    /* class com.ss.android.ugc.aweme.share.improve.a.i.b.AnonymousClass2 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ b f123744a;

                    static {
                        Covode.recordClassIndex(81218);
                    }

                    {
                        this.f123744a = r1;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        s<ag> sVar = this.f123744a.f123739a.f123736b.get();
                        if (sVar != null) {
                            sVar.a(new ag(2, this.f123744a.f123740b));
                        }
                        aw.a(true, this.f123744a.f123740b, this.f123744a.f123739a.f123737c, this.f123744a.f123742d, "");
                        dialogInterface.dismiss();
                    }
                }, false).a().c();
            }
        }
    }

    public i(String str, s<ag> sVar) {
        TCMOrderDeleteApi tCMOrderDeleteApi;
        IRetrofit createNewRetrofit;
        l.d(str, "");
        l.d(sVar, "");
        this.f123737c = str;
        String str2 = Api.f66569d;
        this.f123738e = str2;
        IRetrofitService createIRetrofitServicebyMonsterPlugin = RetrofitService.createIRetrofitServicebyMonsterPlugin(false);
        if (createIRetrofitServicebyMonsterPlugin == null || (createNewRetrofit = createIRetrofitServicebyMonsterPlugin.createNewRetrofit(str2)) == null) {
            tCMOrderDeleteApi = null;
        } else {
            tCMOrderDeleteApi = (TCMOrderDeleteApi) createNewRetrofit.create(TCMOrderDeleteApi.class);
        }
        this.f123735a = tCMOrderDeleteApi;
        this.f123736b = new WeakReference<>(sVar);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context, SharePackage sharePackage) {
        Aweme a2;
        String str;
        long j2;
        t<com.ss.android.ugc.aweme.share.business.tcm.a> b2;
        t<com.ss.android.ugc.aweme.share.business.tcm.a> a3;
        l.d(context, "");
        l.d(sharePackage, "");
        if ((sharePackage instanceof AwemeSharePackage) && sharePackage != null && (a2 = ((AwemeSharePackage) sharePackage).a()) != null) {
            String string = sharePackage.f124595i.getString("tab_name", "");
            String string2 = sharePackage.f124595i.getString("impr_id", "");
            l.b(string2, "");
            l.b(string, "");
            if (com.ss.android.ugc.aweme.story.d.a.d(a2)) {
                str = "story";
            } else {
                str = UGCMonitor.TYPE_POST;
            }
            Story story = a2.getStory();
            if (story != null) {
                j2 = story.getViewerCount();
            } else {
                j2 = -1;
            }
            d a4 = new d().a("group_id", a2.getAid()).a("enter_from", this.f123737c).a("impr_id", string2).a("story_type", str).a("item_vv", j2);
            if (TextUtils.equals(this.f123737c, "personal_homepage")) {
                a4.a("tab_name", string);
            }
            r.a("click_delete_video", a4.f66730a);
            if (m.a(a2) && a2.getStarAtlasOrderId() > 0) {
                TCMOrderDeleteApi tCMOrderDeleteApi = this.f123735a;
                if (tCMOrderDeleteApi != null) {
                    String valueOf = String.valueOf(a2.getStarAtlasOrderId());
                    String aid = a2.getAid();
                    l.b(aid, "");
                    t<com.ss.android.ugc.aweme.share.business.tcm.a> checkTCMOrderDeleteStatus = tCMOrderDeleteApi.checkTCMOrderDeleteStatus(valueOf, aid);
                    if (checkTCMOrderDeleteStatus != null && (b2 = checkTCMOrderDeleteStatus.b(f.a.h.a.b(f.a.k.a.f158006c))) != null && (a3 = b2.a(f.a.a.a.a.a(f.a.a.b.a.f157156a))) != null) {
                        a3.a(new b(this, a2, context, string), c.f123753a);
                    }
                }
            } else if (!j.a(a2) || !m.a(a2)) {
                aw.a(a2);
            } else {
                aw.a(context, a2, this.f123736b.get(), string, this.f123737c, null, 32);
            }
        }
    }
}
