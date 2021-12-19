package com.ss.android.ugc.aweme.tux.a.j;

import android.content.Context;
import android.view.View;
import com.a.b.a.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.badge.b;
import h.f.b.l;
import java.util.Objects;

public final class c {
    static {
        Covode.recordClassIndex(92519);
    }

    public static final boolean a(String str, a aVar, b bVar) {
        switch (str.hashCode()) {
            case -1926202173:
                if (str.equals("app:tux_badgeVariant")) {
                    String str2 = aVar.f4926a;
                    if (str2 != null) {
                        int hashCode = str2.hashCode();
                        if (hashCode != -1034364087) {
                            if (hashCode == 99657 && str2.equals("dot")) {
                                bVar.setVariant(0);
                                return true;
                            }
                        } else if (str2.equals("number")) {
                            bVar.setVariant(1);
                            return true;
                        }
                    }
                    throw new IllegalArgumentException("can not parse tux_badgeVariant: unknown value " + aVar.f4926a);
                }
                return false;
            case -319391448:
                if (str.equals("app:tux_badgeDotSize")) {
                    Objects.requireNonNull(bVar, "null cannot be cast to non-null type android.view.View");
                    Context context = ((View) bVar).getContext();
                    l.b(context, "");
                    bVar.setDotSize((int) com.a.b.b.a.a(context, aVar));
                    return true;
                }
                return false;
            case 1183102157:
                if (str.equals("app:tux_badgeCount")) {
                    String str3 = aVar.f4926a;
                    l.b(str3, "");
                    bVar.setCount(Integer.parseInt(str3));
                    return true;
                }
                return false;
            case 2048955789:
                if (str.equals("app:tux_badgeMaxCount")) {
                    String str4 = aVar.f4926a;
                    if (str4 != null) {
                        switch (str4.hashCode()) {
                            case -1375924450:
                                if (str4.equals("max99plus")) {
                                    bVar.setMaxCount(2);
                                    return true;
                                }
                                break;
                            case 245332047:
                                if (str4.equals("max999plus")) {
                                    bVar.setMaxCount(3);
                                    return true;
                                }
                                break;
                            case 372892271:
                                if (str4.equals("max9plus")) {
                                    bVar.setMaxCount(1);
                                    return true;
                                }
                                break;
                            case 1887918305:
                                if (str4.equals("unlimited")) {
                                    bVar.setMaxCount(0);
                                    return true;
                                }
                                break;
                        }
                    }
                    throw new IllegalArgumentException("can not parse tux_badgeMaxCount: unknown value " + aVar.f4926a);
                }
                return false;
            default:
                return false;
        }
    }
}
