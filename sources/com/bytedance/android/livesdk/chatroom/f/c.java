package com.bytedance.android.livesdk.chatroom.f;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.chatroom.ui.an;
import com.bytedance.android.livesdk.model.message.c.b;
import com.bytedance.android.livesdk.model.message.c.d;
import com.bytedance.android.livesdk.model.message.c.g;
import com.bytedance.android.livesdk.model.message.c.h;
import com.bytedance.android.livesdk.model.message.c.i;
import com.bytedance.android.livesdk.widget.f;
import com.bytedance.android.livesdkapi.host.e;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final Spannable f15496a = new SpannableString("");

    static {
        Covode.recordClassIndex(8563);
    }

    private static int a(String str) {
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            return y.b((int) R.color.a24);
        }
    }

    private static boolean a(g gVar) {
        if (gVar == null || gVar.f19446a == null || TextUtils.isEmpty(((e) a.a(e.class)).a(gVar.f19446a))) {
            return false;
        }
        return true;
    }

    public static Spannable a(b bVar, String str) {
        String str2;
        if (bVar != null) {
            if (bVar.f19421a == null || TextUtils.isEmpty(com.bytedance.android.livesdk.i18n.b.a().a(bVar.f19421a))) {
                str2 = bVar.f19422b;
            } else {
                str2 = com.bytedance.android.livesdk.i18n.b.a().a(bVar.f19421a);
            }
            Spannable a2 = a(str2, bVar, null);
            Spannable spannable = f15496a;
            if (a2 != spannable) {
                return a2;
            }
            if (TextUtils.isEmpty(str)) {
                return spannable;
            }
            return new SpannableString(str);
        } else if (TextUtils.isEmpty(str)) {
            return f15496a;
        } else {
            return new SpannableString(str);
        }
    }

    public static Spannable a(String str, b bVar, b bVar2) {
        if (TextUtils.isEmpty(str) || bVar == null) {
            return f15496a;
        }
        if (bVar.f19424d == null || bVar.f19424d.size() == 0) {
            SpannableString spannableString = new SpannableString(str);
            if (bVar2 != null) {
                spannableString.setSpan(new ForegroundColorSpan(bVar2.G()), 0, spannableString.length(), 18);
            } else if (bVar.f19423c != null) {
                com.bytedance.android.livesdk.model.message.c.c cVar = bVar.f19423c;
                if (!TextUtils.isEmpty(cVar.f19425a)) {
                    spannableString.setSpan(new ForegroundColorSpan(a(cVar.f19425a)), 0, spannableString.length(), 18);
                }
            }
            a(spannableString, 0, spannableString.length(), bVar2, false, -1);
            return spannableString;
        }
        try {
            List<d> list = bVar.f19424d;
            ArrayList arrayList = new ArrayList();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            a(str, list, arrayList, linkedHashMap);
            if (arrayList.size() <= 0 || arrayList.size() != linkedHashMap.size()) {
                return f15496a;
            }
            return a(bVar, arrayList, linkedHashMap, bVar2);
        } catch (Exception e2) {
            com.bytedance.android.live.core.c.a.a(6, "ttlive_exception", e2.getStackTrace());
            StringWriter stringWriter = new StringWriter();
            e2.printStackTrace(new PrintWriter(stringWriter));
            HashMap hashMap = new HashMap();
            hashMap.put("stack_trace", stringWriter.toString());
            com.bytedance.android.live.core.d.c.a(com.bytedance.android.livesdk.ab.d.d.b("ttlive_parse_text_status"), 1, hashMap);
            return f15496a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:161:0x009f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0227  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.text.Spannable a(com.bytedance.android.livesdk.model.message.c.b r18, java.util.List<java.lang.String> r19, java.util.Map<java.lang.Integer, com.bytedance.android.livesdk.model.message.c.d> r20, com.bytedance.android.livesdk.chatroom.f.b r21) {
        /*
        // Method dump skipped, instructions count: 879
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.f.c.a(com.bytedance.android.livesdk.model.message.c.b, java.util.List, java.util.Map, com.bytedance.android.livesdk.chatroom.f.b):android.text.Spannable");
    }

    private static void a(String str, List<d> list, List<String> list2, Map<Integer, d> map) {
        String str2;
        com.bytedance.android.livesdkapi.h.d dVar;
        if (str != null && list != null && list.size() != 0) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(list2);
            arrayList.add(map);
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            int i3 = -1;
            int i4 = 0;
            int i5 = 0;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            while (i4 < str.length()) {
                char charAt = str.charAt(i4);
                if (charAt != ':') {
                    if (charAt != '{') {
                        if (charAt == '}') {
                            if (i6 != i3) {
                                str2 = str.subSequence(i6, i4).toString();
                            } else {
                                i8 = Integer.valueOf(str.subSequence(i7, i4).toString()).intValue();
                                str2 = "string";
                            }
                            if (i8 != i3) {
                                if (sb.length() > 0) {
                                    sb.delete(i2, sb.length());
                                }
                                String str3 = null;
                                if (i8 >= 0 && i8 < list.size() && !TextUtils.isEmpty(str2) && list.size() != 0) {
                                    d dVar2 = list.get(i8);
                                    int i9 = dVar2.f19433a;
                                    if (i9 == com.bytedance.android.livesdkapi.h.d.HEART.getPieceType()) {
                                        dVar = com.bytedance.android.livesdkapi.h.d.HEART;
                                    } else if (i9 == com.bytedance.android.livesdkapi.h.d.USER.getPieceType()) {
                                        dVar = com.bytedance.android.livesdkapi.h.d.USER;
                                    } else if (i9 == com.bytedance.android.livesdkapi.h.d.STRING.getPieceType()) {
                                        dVar = com.bytedance.android.livesdkapi.h.d.STRING;
                                    } else if (i9 == com.bytedance.android.livesdkapi.h.d.GIFT.getPieceType()) {
                                        dVar = com.bytedance.android.livesdkapi.h.d.GIFT;
                                    } else if (i9 == com.bytedance.android.livesdkapi.h.d.PATTERN_REF.getPieceType()) {
                                        dVar = com.bytedance.android.livesdkapi.h.d.PATTERN_REF;
                                    } else if (i9 == com.bytedance.android.livesdkapi.h.d.IMAGE.getPieceType()) {
                                        dVar = com.bytedance.android.livesdkapi.h.d.IMAGE;
                                    } else {
                                        dVar = com.bytedance.android.livesdkapi.h.d.UNKNOWN;
                                    }
                                    if (dVar.getTag().equals(str2)) {
                                        int i10 = dVar2.f19433a;
                                        String str4 = "";
                                        if (i10 == com.bytedance.android.livesdkapi.h.d.STRING.getPieceType()) {
                                            str3 = dVar2.f19435c;
                                        } else if (i10 == com.bytedance.android.livesdkapi.h.d.USER.getPieceType()) {
                                            i iVar = dVar2.f19436d;
                                            if (!(iVar == null || iVar.f19453a == null)) {
                                                str3 = com.bytedance.android.livesdk.ac.g.a(iVar.f19453a) + str4;
                                            }
                                        } else if (i10 == com.bytedance.android.livesdkapi.h.d.GIFT.getPieceType()) {
                                            com.bytedance.android.livesdk.model.message.c.e eVar = dVar2.f19437e;
                                            if (eVar != null) {
                                                if (eVar.f19443c == 0) {
                                                    if (eVar.f19442b == null || eVar.f19442b.f19419a == null) {
                                                        str3 = y.a((int) R.string.gqz) + " . ";
                                                    } else {
                                                        if (eVar.f19442b.f19419a != null) {
                                                            str4 = com.bytedance.android.livesdk.i18n.b.a().a(eVar.f19442b.f19419a);
                                                        }
                                                        if (TextUtils.isEmpty(str4)) {
                                                            str4 = eVar.f19442b.f19420b;
                                                        }
                                                        if (TextUtils.isEmpty(str4)) {
                                                            str4 = y.a((int) R.string.gqz);
                                                        }
                                                        str3 = str4 + " . ";
                                                    }
                                                } else if (eVar.f19443c == 1 && eVar.f19444d != null) {
                                                    str3 = eVar.f19444d.f19758a;
                                                }
                                            }
                                        } else if (dVar2.f19433a == com.bytedance.android.livesdkapi.h.d.HEART.getPieceType()) {
                                            str3 = " ";
                                        } else {
                                            if (i10 == com.bytedance.android.livesdkapi.h.d.PATTERN_REF.getPieceType()) {
                                                h hVar = dVar2.f19439g;
                                                if (hVar != null) {
                                                    if (!TextUtils.isEmpty(hVar.f19451a) && !TextUtils.isEmpty(com.bytedance.android.livesdk.i18n.b.a().a(hVar.f19451a))) {
                                                        str4 = com.bytedance.android.livesdk.i18n.b.a().a(hVar.f19451a);
                                                    } else if (!TextUtils.isEmpty(hVar.f19452b)) {
                                                        str4 = hVar.f19452b;
                                                    }
                                                }
                                            } else if (i10 == com.bytedance.android.livesdkapi.h.d.IMAGE.getPieceType()) {
                                                if (a(dVar2.f19440h)) {
                                                    str3 = ".";
                                                }
                                            }
                                            str3 = str4;
                                        }
                                        list2.add(str3);
                                        map.put(Integer.valueOf(list2.size() - 1), dVar2);
                                        i5--;
                                        i6 = -1;
                                        i8 = -1;
                                    } else {
                                        com.bytedance.android.live.core.c.a.a(6, "I18N_MESSAGE", "TextPieceHelper: tag is false");
                                    }
                                }
                                com.bytedance.android.live.core.c.a.a(6, "I18N_MESSAGE", "piece result is null !!! \npattern:" + str + "... index:" + i8 + "...tag:" + str2);
                                i5--;
                                i6 = -1;
                                i8 = -1;
                            } else {
                                return;
                            }
                        } else if (charAt == '}') {
                        }
                        i4++;
                        i2 = 0;
                        i3 = -1;
                    } else {
                        i5++;
                        if (i5 == 1) {
                            i7 = i4 + 1;
                            if (sb.length() > 0 && sb.length() > 0) {
                                list2.add(sb.toString());
                                map.put(Integer.valueOf(list2.size() - 1), new a());
                                sb.delete(0, sb.length());
                            }
                        } else {
                            return;
                        }
                    }
                } else if (i5 == 0) {
                    continue;
                    i4++;
                    i2 = 0;
                    i3 = -1;
                } else if (i5 == 1) {
                    i8 = Integer.valueOf(str.subSequence(i7, i4).toString()).intValue();
                    i6 = i4 + 1;
                    i7 = -1;
                } else {
                    return;
                }
                sb.append(charAt);
                i4++;
                i2 = 0;
                i3 = -1;
            }
            if (sb.length() > 0) {
                list2.add(sb.toString());
                map.put(Integer.valueOf(list2.size() - 1), new a());
                sb.delete(0, sb.length());
            }
        }
    }

    public static void a(Spannable spannable, Bitmap bitmap, int i2, int i3, b bVar) {
        if (bitmap != null && !bitmap.isRecycled() && spannable != null && spannable.length() != 0 && i2 >= 0 && i2 <= spannable.length() && i2 <= i3) {
            Context e2 = y.e();
            int b2 = (int) n.b(y.e(), 16.0f);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(e2.getResources(), bitmap);
            bitmapDrawable.setBounds(0, 0, b2, b2);
            spannable.setSpan(new f(bitmapDrawable), i2, i3, 33);
            a(spannable, i2, i3, bVar, false, -1);
        }
    }

    private static void a(Spannable spannable, int i2, int i3, b bVar, boolean z, int i4) {
        an anVar;
        if (bVar != null && bVar.b() != null) {
            if (z) {
                anVar = new an(bVar.b(), i4);
            } else {
                anVar = new an(bVar.b());
            }
            spannable.setSpan(anVar, i2, i3, 17);
        }
    }
}
