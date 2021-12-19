package com.ss.android.ugc.aweme.tools.draft.ftc.pages;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.h.v;
import androidx.fragment.app.e;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.df.c;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.metrics.ah;
import com.ss.android.ugc.aweme.port.in.aa;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity;
import com.ss.android.ugc.aweme.tools.draft.ay;
import com.ss.android.ugc.aweme.utils.d;
import com.ss.android.ugc.tools.utils.q;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Objects;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

public final class f extends com.ss.android.ugc.aweme.tools.draft.a.a<c> {

    /* renamed from: f  reason: collision with root package name */
    public static final a f139597f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    TextView f139598a;

    /* renamed from: b  reason: collision with root package name */
    TextView f139599b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f139600c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f139601d;

    /* renamed from: e  reason: collision with root package name */
    final boolean f139602e;

    static {
        Covode.recordClassIndex(91263);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(91264);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f139603a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f139604b;

        static {
            Covode.recordClassIndex(91265);
        }

        b(f fVar, c cVar) {
            this.f139603a = fVar;
            this.f139604b = cVar;
        }

        static final class a extends m implements h.f.a.a<z> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f139605a = new a();

            static {
                Covode.recordClassIndex(91268);
            }

            a() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                com.ss.android.ugc.aweme.port.in.c.f115629h.a();
                return z.f158842a;
            }
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            l.d(view, "");
            cr.a();
            if (cr.a(view.getContext())) {
                aa b2 = com.ss.android.ugc.aweme.port.in.l.f115658a.b();
                com.ss.android.ugc.aweme.shortvideo.c cVar = this.f139604b.f83185f;
                l.b(cVar, "");
                if (b2.a(cVar, this.f139603a.f139601d, true)) {
                    View view2 = this.f139603a.itemView;
                    l.b(view2, "");
                    Context context = view2.getContext();
                    Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                    final e eVar = (e) context;
                    final ProgressDialog a2 = com.ss.android.ugc.aweme.tools.draft.e.a.a(eVar, a.f139605a);
                    ay.a(eVar, this.f139604b, new h.f.a.m<Boolean, String, z>(this) {
                        /* class com.ss.android.ugc.aweme.tools.draft.ftc.pages.f.b.AnonymousClass1 */
                        final /* synthetic */ b this$0;

                        static {
                            Covode.recordClassIndex(91266);
                        }

                        {
                            this.this$0 = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                        @Override // h.f.a.m
                        public final /* synthetic */ z invoke(Boolean bool, String str) {
                            if (!bool.booleanValue()) {
                                new com.ss.android.ugc.aweme.tux.a.i.a(eVar).a(R.string.dcb).a();
                            } else if (c.C1870c.f80046a.a()) {
                                q.d("app is running background");
                            } else {
                                com.ss.android.ugc.aweme.shortvideo.c clone = this.this$0.f139604b.f83185f.clone();
                                if (clone != null) {
                                    clone.setMusicPriority(99);
                                    cr.a().a(clone);
                                    String str2 = this.this$0.f139604b.f83187h;
                                    int i2 = this.this$0.f139604b.n;
                                    com.ss.android.ugc.aweme.df.e.a("toVideoRecord() called with: path = [" + str2 + "], context = [], musicModel = [" + clone + "], start = [" + i2 + "]");
                                    try {
                                        new JSONObject().put("route", "1");
                                    } catch (JSONException e2) {
                                        e2.printStackTrace();
                                    }
                                    ah.f109483a = "draft_page";
                                    e eVar = eVar;
                                    String musicId = clone.getMusicId();
                                    l.b(musicId, "");
                                    l.b(str2, "");
                                    String uuid = UUID.randomUUID().toString();
                                    l.b(uuid, "");
                                    d.a("shoot", new com.ss.android.ugc.tools.f.b().a("creation_id", uuid).a("shoot_way", "edit_draft").a("music_id", musicId).a("is_ui_shoot", false).f149193a);
                                    com.ss.android.ugc.aweme.df.e.a("toVideoActivity() called with: context = [ ], path = [" + str2 + "], musicStart = [" + i2 + "]");
                                    Intent intent = new Intent();
                                    intent.putExtra("path", str2);
                                    intent.putExtra("music_start", i2);
                                    intent.putExtra("record_from", 1);
                                    intent.putExtra("translation_type", 3);
                                    intent.putExtra("shoot_way", "draft_again");
                                    intent.putExtra("creation_id", uuid);
                                    cr.a().g();
                                    intent.setClass(eVar, VideoRecordPermissionActivity.class);
                                    com.ss.android.ugc.tiktok.security.a.a.a(intent, eVar);
                                    eVar.startActivity(intent);
                                }
                            }
                            return z.f158842a;
                        }
                    }, new h.f.a.a<z>(this) {
                        /* class com.ss.android.ugc.aweme.tools.draft.ftc.pages.f.b.AnonymousClass2 */
                        final /* synthetic */ b this$0;

                        static {
                            Covode.recordClassIndex(91267);
                        }

                        {
                            this.this$0 = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // h.f.a.a
                        public final /* synthetic */ z invoke() {
                            ProgressDialog progressDialog = a2;
                            if (progressDialog != null) {
                                progressDialog.dismiss();
                            }
                            return z.f158842a;
                        }
                    }).a();
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(boolean z, View view) {
        super(view);
        l.d(view, "");
        this.f139602e = z;
        Context context = view.getContext();
        l.b(context, "");
        this.f139601d = context;
        View c2 = v.c(view, (int) R.id.f37);
        l.b(c2, "");
        this.f139598a = (TextView) c2;
        View c3 = v.c(view, (int) R.id.ev_);
        l.b(c3, "");
        TextView textView = (TextView) c3;
        this.f139599b = textView;
        if (textView == null) {
            l.a("mNext");
        }
        TextView textView2 = this.f139599b;
        if (textView2 == null) {
            l.a("mNext");
        }
        textView.setPadding(textView2.getPaddingLeft(), 0, 0, 0);
        TextView textView3 = this.f139599b;
        if (textView3 == null) {
            l.a("mNext");
        }
        ViewGroup.LayoutParams layoutParams = textView3.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, (int) n.b(context, 16.0f), (int) n.b(context, 16.0f), (int) n.b(context, 8.0f));
        int i2 = Build.VERSION.SDK_INT;
        marginLayoutParams.setMarginEnd((int) n.b(context, 16.0f));
        TextView textView4 = this.f139599b;
        if (textView4 == null) {
            l.a("mNext");
        }
        textView4.setLayoutParams(marginLayoutParams);
    }
}
