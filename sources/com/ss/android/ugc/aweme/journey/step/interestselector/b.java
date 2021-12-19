package com.ss.android.ugc.aweme.journey.step.interestselector;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.journey.q;
import com.ss.android.ugc.aweme.journey.w;
import com.ss.android.ugc.aweme.utils.dg;
import com.zhiliaoapp.musically.R;
import h.e.c;
import h.f.b.l;
import h.m.d;
import h.m.p;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.LinkedList;
import java.util.List;

public final class b {
    static {
        Covode.recordClassIndex(67360);
    }

    public static final class a extends com.google.gson.b.a<List<? extends w>> {
        static {
            Covode.recordClassIndex(67361);
        }

        a() {
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public static final List<w> a(Context context) {
        String string;
        MethodCollector.i(5821);
        l.d(context, "");
        InputStream open = context.getAssets().open("interest_list/interest_list_" + ((String) q.f104900h.getValue()) + ".json");
        l.b(open, "");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open, d.f158808a), 8192);
        try {
            String a2 = h.e.q.a((Reader) bufferedReader);
            c.a(bufferedReader, null);
            List<w> list = (List) dg.a().a(a2, new a().type);
            if (list == null || list.isEmpty()) {
                list = new LinkedList<>();
            }
            for (w wVar : list) {
                String str = wVar.f105209a;
                l.d(str, "");
                l.d(context, "");
                switch (str.hashCode()) {
                    case -2028215897:
                        if (str.equals("Clothing & Apparel")) {
                            string = context.getString(R.string.dez);
                            l.b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case -1963180254:
                        if (str.equals("Kollywood")) {
                            string = context.getString(R.string.dfh);
                            l.b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case -1811893345:
                        if (str.equals("Sports")) {
                            string = context.getString(R.string.dfu);
                            l.b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case -1797219060:
                        if (str.equals("Talent")) {
                            string = context.getString(R.string.dfw);
                            l.b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case -1781830854:
                        if (str.equals("Travel")) {
                            string = context.getString(R.string.dfz);
                            l.b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case -1082679165:
                        if (str.equals("Oddly Satisfying")) {
                            string = context.getString(R.string.dfq);
                            l.b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case -1050401237:
                        if (str.equals("Tollywood")) {
                            string = context.getString(R.string.dfm);
                            l.b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case -833750813:
                        if (str.equals("Daily Life")) {
                            string = context.getString(R.string.df1);
                            l.b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case -752113842:
                        if (str.equals("Life Hacks")) {
                            if (p.a("US", q.a(), true)) {
                                string = context.getString(R.string.dg1);
                            } else {
                                string = context.getString(R.string.df4);
                            }
                            l.b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case -720253902:
                        if (str.equals("Science & Education")) {
                            string = context.getString(R.string.dft);
                            l.b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case -686144149:
                        if (str.equals("Occupation")) {
                            string = context.getString(R.string.dfp);
                            l.b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case -317480538:
                        if (str.equals("Emotional")) {
                            string = context.getString(R.string.dfe);
                            l.b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case -254629764:
                        if (str.equals("Motivation & Advice")) {
                            string = context.getString(R.string.dfo);
                            l.b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case -210304353:
                        if (str.equals("Pop Culture")) {
                            string = context.getString(R.string.dfs);
                            l.b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case -86374264:
                        if (str.equals("Fashion Accessories")) {
                            string = context.getString(R.string.df8);
                            l.b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case 66115:
                        if (str.equals("Art")) {
                            string = context.getString(R.string.dev);
                            l.b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case 67700:
                        if (str.equals("DIY")) {
                            string = context.getString(R.string.dg0);
                            l.b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case 2052559:
                        if (str.equals("Auto")) {
                            string = context.getString(R.string.dew);
                            l.b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case 2195582:
                        if (str.equals("Food")) {
                            string = context.getString(R.string.df_);
                            l.b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case 2602678:
                        if (str.equals("Tech")) {
                            string = context.getString(R.string.dfx);
                            l.b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case 65798035:
                        if (str.equals("Dance")) {
                            string = context.getString(R.string.df2);
                            l.b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case 66292295:
                        if (str.equals("Drama")) {
                            string = context.getString(R.string.df5);
                            l.b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case 74710533:
                        if (str.equals("Music")) {
                            string = context.getString(R.string.dg2);
                            l.b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case 123562007:
                        if (str.equals("Outdoors")) {
                            string = context.getString(R.string.dfr);
                            l.b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case 169588576:
                        if (str.equals("Tech & Science")) {
                            string = context.getString(R.string.dfl);
                            l.b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case 400139022:
                        if (str.equals("Fitness & Health")) {
                            string = context.getString(R.string.df9);
                            l.b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case 587876755:
                        if (str.equals("Beauty & Style")) {
                            string = context.getString(R.string.dex);
                            l.b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case 807717335:
                        if (str.equals("Animals")) {
                            string = context.getString(R.string.deu);
                            l.b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case 982113085:
                        if (str.equals("Arts & Crafts")) {
                            string = context.getString(R.string.dfc);
                            l.b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case 1085311376:
                        if (str.equals("Home & Garden")) {
                            string = context.getString(R.string.dfb);
                            l.b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case 1298968424:
                        if (str.equals("Entertainment")) {
                            string = context.getString(R.string.dff);
                            l.b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case 1414863620:
                        if (str.equals("Home decor")) {
                            string = context.getString(R.string.dfg);
                            l.b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case 1419008025:
                        if (str.equals("Bollywood")) {
                            string = context.getString(R.string.dfd);
                            l.b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case 1461903030:
                        if (str.equals("Motivation")) {
                            string = context.getString(R.string.dfj);
                            l.b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case 1638848318:
                        if (str.equals("Learning")) {
                            string = context.getString(R.string.dfi);
                            l.b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case 1665004953:
                        if (str.equals("Nature & Wildlife")) {
                            string = context.getString(R.string.dfk);
                            l.b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case 1961668532:
                        if (str.equals("DIY & Life Hacks")) {
                            string = context.getString(R.string.df4);
                            l.b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case 2024011449:
                        if (str.equals("Comedy")) {
                            string = context.getString(R.string.df0);
                            l.b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case 2096973700:
                        if (str.equals("Family")) {
                            string = context.getString(R.string.df6);
                            l.b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case 2096998767:
                        if (str.equals("Fandom")) {
                            string = context.getString(R.string.df7);
                            l.b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    case 2125602895:
                        if (str.equals("Gaming")) {
                            string = context.getString(R.string.dfa);
                            l.b(string, "");
                            break;
                        }
                        string = "";
                        break;
                    default:
                        string = "";
                        break;
                }
                if (!TextUtils.isEmpty(string)) {
                    wVar.f105210b = string;
                }
            }
            MethodCollector.o(5821);
            return list;
        } catch (Throwable th) {
            c.a(bufferedReader, th);
            MethodCollector.o(5821);
            throw th;
        }
    }
}
