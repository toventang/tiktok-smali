package com.ss.android.ugc.aweme.discover.mixfeed.d;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.sheet.a.a;
import com.google.gson.o;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.discover.mixfeed.h;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.search.k.bf;
import com.ss.android.ugc.aweme.search.k.bg;
import com.ss.android.ugc.aweme.search.k.bi;
import com.ss.android.ugc.aweme.search.k.bk;
import com.ss.android.ugc.aweme.search.k.r;
import com.ss.android.ugc.aweme.utils.dg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class e {
    static {
        Covode.recordClassIndex(50771);
    }

    static final class c implements DialogInterface.OnCancelListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Word f81727a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r f81728b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f81729c;

        static {
            Covode.recordClassIndex(50774);
        }

        c(Word word, r rVar, String str) {
            this.f81727a = word;
            this.f81728b = rVar;
            this.f81729c = str;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            e.a(this.f81727a, this.f81728b, "cancel", this.f81729c);
        }
    }

    static final class b extends m implements h.f.a.b<View, z> {
        final /* synthetic */ Context $context;
        final /* synthetic */ r $mobParam;
        final /* synthetic */ Word $word;
        final /* synthetic */ String $wordSource;

        static {
            Covode.recordClassIndex(50773);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Word word, r rVar, String str, Context context) {
            super(1);
            this.$word = word;
            this.$mobParam = rVar;
            this.$wordSource = str;
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(View view) {
            l.d(view, "");
            e.a(this.$word, this.$mobParam, "not_relevant", this.$wordSource);
            Activity a2 = com.ss.android.ugc.aweme.base.a.e.a(this.$context);
            if (a2 != null) {
                new com.bytedance.tux.g.b(a2).e(R.string.fj5).b();
            }
            return z.f158842a;
        }
    }

    public static final boolean a(h hVar) {
        List<g> list;
        if (hVar == null || (list = hVar.f81784f) == null || list.size() < 4) {
            return false;
        }
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().f81747a.length() <= 0) {
                    return false;
                }
            }
        }
        return true;
    }

    static final class a extends m implements h.f.a.b<View, z> {
        final /* synthetic */ Context $context;
        final /* synthetic */ r $mobParam;
        final /* synthetic */ Word $word;
        final /* synthetic */ String $wordSource;

        static {
            Covode.recordClassIndex(50772);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Word word, r rVar, String str, Context context) {
            super(1);
            this.$word = word;
            this.$mobParam = rVar;
            this.$wordSource = str;
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(View view) {
            String str;
            String str2;
            String str3;
            String str4;
            Integer num;
            String str5;
            String str6 = "";
            l.d(view, str6);
            e.a(this.$word, this.$mobParam, "confirm", this.$wordSource);
            Context context = this.$context;
            Word word = this.$word;
            r rVar = this.$mobParam;
            String str7 = this.$wordSource;
            l.d(context, str6);
            l.d(str7, str6);
            if (com.ss.android.ugc.aweme.base.a.e.a(context) != null) {
                Uri.Builder appendQueryParameter = new Uri.Builder().appendQueryParameter("report_type", "sug_recommend");
                String str8 = null;
                if (word != null) {
                    str = word.getId();
                } else {
                    str = null;
                }
                Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("object_id", str);
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                l.b(g2, str6);
                Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("owner_id", g2.getCurUserId());
                if (word != null) {
                    str2 = word.getWord();
                } else {
                    str2 = null;
                }
                Uri.Builder appendQueryParameter4 = appendQueryParameter3.appendQueryParameter("sug_content", str2);
                o oVar = new o();
                if (rVar != null) {
                    try {
                        str3 = rVar.f121271f;
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                } else {
                    str3 = null;
                }
                oVar.a("raw_query", str3);
                if (word != null) {
                    str4 = word.getWord();
                } else {
                    str4 = null;
                }
                oVar.a("words_content", str4);
                if (word != null) {
                    num = Integer.valueOf(word.getWordPosition());
                } else {
                    num = null;
                }
                oVar.a("words_position", num);
                if (rVar != null) {
                    str5 = rVar.f121275j;
                } else {
                    str5 = null;
                }
                oVar.a("impr_id", str5);
                if (word != null) {
                    str8 = word.getId();
                }
                oVar.a("group_id", str8);
                oVar.a("words_source", str7);
                str6 = dg.a().b(oVar);
                appendQueryParameter4.appendQueryParameter("extra", str6);
                com.ss.android.ugc.aweme.compliance.api.a.a().a(com.ss.android.ugc.aweme.base.a.e.a(context), appendQueryParameter4);
            }
            return z.f158842a;
        }
    }

    private static void a(Word word, r rVar, String str) {
        String str2;
        String str3;
        Integer num;
        String str4;
        l.d(str, "");
        bg bgVar = new bg();
        String str5 = null;
        if (rVar != null) {
            str2 = rVar.f121271f;
        } else {
            str2 = null;
        }
        bk x = bgVar.x(str2);
        if (word != null) {
            str3 = word.getWord();
        } else {
            str3 = null;
        }
        bk w = x.w(str3);
        if (word != null) {
            num = Integer.valueOf(word.getWordPosition());
        } else {
            num = null;
        }
        bk d2 = w.d(num);
        if (rVar != null) {
            str4 = rVar.f121275j;
        } else {
            str4 = null;
        }
        com.ss.android.ugc.aweme.search.k.c d3 = d2.d(str4);
        if (word != null) {
            str5 = word.getId();
        }
        ((bg) d3.i(str5)).r(str).f();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.tux.sheet.a.a$d[] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(Context context, r rVar, Word word, String str) {
        i supportFragmentManager;
        l.d(context, "");
        l.d(str, "");
        a(word, rVar, str);
        new com.bytedance.tux.h.h(context).a();
        com.bytedance.tux.sheet.a.a b2 = new a.b().a(new a.d().c(R.raw.icon_flag).a(R.string.ga_).a(new a(word, rVar, str, context)), new a.d().c(R.raw.icon_heart_broken).a(R.string.fj2).a(new b(word, rVar, str, context))).a(new c(word, rVar, str)).b();
        if (!(context instanceof androidx.fragment.app.e)) {
            context = null;
        }
        androidx.fragment.app.e eVar = (androidx.fragment.app.e) context;
        if (eVar != null && (supportFragmentManager = eVar.getSupportFragmentManager()) != null) {
            b2.show(supportFragmentManager, "recommend report");
        }
    }

    public static final void a(Word word, r rVar, String str, String str2) {
        String str3;
        String str4;
        Integer num;
        String str5;
        l.d(str, "");
        l.d(str2, "");
        bf bfVar = new bf();
        String str6 = null;
        if (rVar != null) {
            str3 = rVar.f121271f;
        } else {
            str3 = null;
        }
        bk x = bfVar.x(str3);
        if (word != null) {
            str4 = word.getWord();
        } else {
            str4 = null;
        }
        bk w = x.w(str4);
        if (word != null) {
            num = Integer.valueOf(word.getWordPosition());
        } else {
            num = null;
        }
        bk d2 = w.d(num);
        if (rVar != null) {
            str5 = rVar.f121275j;
        } else {
            str5 = null;
        }
        com.ss.android.ugc.aweme.search.k.c d3 = d2.d(str5);
        if (word != null) {
            str6 = word.getId();
        }
        ((bf) d3.i(str6)).r(str).s(str2).f();
    }

    public static final void a(String str, int i2, String str2, String str3, r rVar) {
        String str4;
        l.d(str, "");
        bk c2 = new bi().v(str).c(Integer.valueOf(i2));
        String str5 = null;
        if (rVar != null) {
            str4 = rVar.f121274i;
        } else {
            str4 = null;
        }
        com.ss.android.ugc.aweme.search.k.c a2 = c2.a(str4);
        if (rVar != null) {
            str5 = rVar.f121275j;
        }
        ((bk) a2.d(str5)).x(str2).y("general").a(new d().a("enter_group_id", str3).f66730a).f();
    }
}
