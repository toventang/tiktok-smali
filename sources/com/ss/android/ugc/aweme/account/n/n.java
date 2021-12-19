package com.ss.android.ugc.aweme.account.n;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.global.config.settings.c;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.global.config.settings.pojo.WhatsAppCodeItem;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.m.p;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final n f65187a = new n();

    /* renamed from: b  reason: collision with root package name */
    private static final Set<String> f65188b = new LinkedHashSet();

    /* renamed from: c  reason: collision with root package name */
    private static final h f65189c = i.a((h.f.a.a) a.f65190a);

    private n() {
    }

    static final class a extends m implements h.f.a.a<List<WhatsAppCodeItem>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f65190a = new a();

        static {
            Covode.recordClassIndex(40080);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<WhatsAppCodeItem> invoke() {
            return a();
        }

        private static List<WhatsAppCodeItem> a() {
            try {
                IESSettingsProxy iESSettingsProxy = c.f99077a.f99078b;
                l.b(iESSettingsProxy, "");
                List<WhatsAppCodeItem> showWhatsappByCallingCode = iESSettingsProxy.getShowWhatsappByCallingCode();
                l.b(showWhatsappByCallingCode, "");
                if (!showWhatsappByCallingCode.isEmpty()) {
                    return showWhatsappByCallingCode;
                }
                return null;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    static {
        Covode.recordClassIndex(40079);
    }

    public static final boolean a(String str) {
        if (c(str) != null) {
            return true;
        }
        return false;
    }

    public static final boolean b(String str) {
        Boolean whatsappFirst;
        try {
            WhatsAppCodeItem c2 = c(str);
            if (c2 == null || (whatsappFirst = c2.getWhatsappFirst()) == null) {
                return true;
            }
            return whatsappFirst.booleanValue();
        } catch (Exception unused) {
            return true;
        }
    }

    private static WhatsAppCodeItem c(String str) {
        List list;
        Object obj = null;
        if (str == null || (list = (List) f65189c.getValue()) == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            boolean z = false;
            try {
                String callingCode = ((WhatsAppCodeItem) next).getCallingCode();
                l.b(callingCode, "");
                if (callingCode != null) {
                    String a2 = p.a(p.b((CharSequence) callingCode).toString(), "+", "");
                    String a3 = p.a(p.b((CharSequence) str).toString(), "+", "");
                    if (!TextUtils.isEmpty(a2)) {
                        z = TextUtils.equals(a2, a3);
                        if (z) {
                            obj = next;
                            break;
                        }
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                }
            } catch (Exception unused) {
            }
        }
        return (WhatsAppCodeItem) obj;
    }
}
