package com.ss.android.ugc.aweme.editSticker.text.bean;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.widget.EditText;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.editSticker.d;
import com.ss.android.ugc.aweme.editSticker.h;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.TextStruct;
import com.ss.android.ugc.tools.utils.r;
import h.a.n;
import h.f.b.l;
import h.m.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static int f88454a;

    static {
        Covode.recordClassIndex(55672);
    }

    public static final class b extends com.google.gson.b.a<HashMap<String, String>> {
        static {
            Covode.recordClassIndex(55674);
        }

        b() {
        }
    }

    public static final boolean a(List<InteractTextStructWrap> list, int i2) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (next.isValid(i2)) {
                if (next != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean a(List<TextStickerTextWrap> list) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (!next.isReplaceString()) {
                if (next != null) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final float a(Context context) {
        l.d(context, "");
        return r.a(context, 4.0f);
    }

    public static final List<TextStickerTextWrap> a(String str) {
        return n.d(a(str, false));
    }

    public static final boolean e(List<TextStickerTextWrap> list) {
        if (list == null) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (next.isValid()) {
                if (next != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final List<CreateAnchorInfo> f(List<TextStickerTextWrap> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return new ArrayList();
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().getAnchorInfoList());
        }
        return arrayList;
    }

    public static final boolean g(List<TextStickerTextWrap> list) {
        if (list == null) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (!next.safeStrPair().f88416b.isEmpty()) {
                if (next != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean h(List<TextStickerTextWrap> list) {
        l.d(list, "");
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            String str = next.safeStrPair().f88415a;
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
            if (p.b((CharSequence) str).toString().length() > 0) {
                if (next != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final String i(List<TextStickerTextWrap> list) {
        if (list == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder("");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next().getText());
        }
        String sb2 = sb.toString();
        l.b(sb2, "");
        return sb2;
    }

    public static final TextStickerTextWrap a(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return new TextStickerTextWrap(null, null, 0, false, false, 31, null);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append(str);
            linkedHashMap.put(new TextStickerString(str), new ArrayList());
        }
        String sb2 = sb.toString();
        l.b(sb2, "");
        return new TextStickerTextWrap(linkedHashMap, new TextStickerTextPair(sb2, new ArrayList()), 0, false, false, 28, null);
    }

    public static final TextStickerString[] b(List<TextStickerTextWrap> list) {
        if (list == null || list.isEmpty()) {
            return new TextStickerString[0];
        }
        if (list.size() == 1) {
            Object[] array = list.get(0).getStrMap().keySet().toArray(new TextStickerString[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            return (TextStickerString[]) array;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            T t = next;
            if (!t.isReplaceString()) {
                String text = t.getText();
                Objects.requireNonNull(text, "null cannot be cast to non-null type kotlin.CharSequence");
                if (p.b((CharSequence) text).toString().length() > 0) {
                    if (next != null) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList<TextStickerTextWrap> arrayList2 = new ArrayList();
                        for (T t2 : list) {
                            T t3 = t2;
                            if (!t3.isReplaceString()) {
                                String text2 = t3.getText();
                                Objects.requireNonNull(text2, "null cannot be cast to non-null type kotlin.CharSequence");
                                if (p.b((CharSequence) text2).toString().length() > 0) {
                                    arrayList2.add(t2);
                                }
                            }
                        }
                        for (TextStickerTextWrap textStickerTextWrap : arrayList2) {
                            arrayList.addAll(textStickerTextWrap.getStrMap().keySet());
                        }
                        Object[] array2 = arrayList.toArray(new TextStickerString[0]);
                        Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
                        return (TextStickerString[]) array2;
                    }
                }
            }
        }
        Object[] array3 = list.get(0).getStrMap().keySet().toArray(new TextStickerString[0]);
        Objects.requireNonNull(array3, "null cannot be cast to non-null type kotlin.Array<T>");
        return (TextStickerString[]) array3;
    }

    public static final String c(List<TextStickerTextWrap> list) {
        boolean z;
        int i2 = 0;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (t.isValid()) {
                arrayList.add(t);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (!(!arrayList2.isEmpty()) || arrayList2 == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder("");
        if (arrayList2.size() > 1) {
            int size = arrayList2.size() - 2;
            if (size >= 0) {
                while (true) {
                    sb.append(((TextStickerTextWrap) arrayList2.get(i2)).safeStrPair().f88415a);
                    sb.append("\n");
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
            sb.append(((TextStickerTextWrap) arrayList2.get(arrayList2.size() - 1)).safeStrPair().f88415a);
        } else {
            sb.append(((TextStickerTextWrap) arrayList2.get(0)).safeStrPair().f88415a);
        }
        String sb2 = sb.toString();
        l.b(sb2, "");
        return sb2;
    }

    public static final List<InteractTextStructWrap> d(List<TextStickerTextWrap> list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (t.isValid()) {
                arrayList.add(t);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (!(!arrayList2.isEmpty()) || arrayList2 == null) {
            return new ArrayList();
        }
        if (arrayList2.size() == 1) {
            return ((TextStickerTextWrap) arrayList2.get(0)).safeStrPair().f88416b;
        }
        int size = arrayList2.size();
        for (int i2 = 1; i2 < size; i2++) {
            for (T t2 : ((TextStickerTextWrap) arrayList2.get(i2)).safeStrPair().f88416b) {
                t2.getRange().getStart();
                t2.getRange().getEnd();
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            n.a((Collection) arrayList3, (Iterable) it.next().safeStrPair().f88416b);
        }
        return arrayList3;
    }

    public static final List<CreateAnchorInfo> j(List<? extends InteractStickerStruct> list) {
        boolean z;
        TextStruct textStruct;
        List<CreateAnchorInfo> list2;
        ArrayList<CreateAnchorInfo> arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        ArrayList<InteractStickerStruct> arrayList2 = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean z2 = true;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (next.getType() != 5) {
                z2 = false;
            }
            if (z2) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (InteractStickerStruct interactStickerStruct : arrayList2) {
            try {
                textStruct = (TextStruct) d.b().a(interactStickerStruct.getTextStruct(), TextStruct.class);
            } catch (Exception unused) {
                textStruct = null;
            }
            if (textStruct == null || (list2 = textStruct.getAnchors()) == null) {
                list2 = new ArrayList<>();
            }
            n.a((Collection) arrayList3, (Iterable) list2);
        }
        arrayList.addAll(arrayList3);
        for (CreateAnchorInfo createAnchorInfo : arrayList) {
            String iconUrl = createAnchorInfo.getIconUrl();
            if (iconUrl == null || iconUrl.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                createAnchorInfo.setIconUrl("https://p16.tiktokcdn.com/obj/tiktok-obj/wiki_anchor_new.png");
                createAnchorInfo.setAddTime(0L);
            }
        }
        return arrayList;
    }

    public static final List<CreateAnchorInfo> k(List<? extends InteractStickerStruct> list) {
        Exception e2;
        String str;
        String str2;
        long j2;
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("add_from", 1);
        String jSONObject2 = jSONObject.toString();
        l.b(jSONObject2, "");
        ArrayList<InteractStickerStruct> arrayList2 = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean z2 = false;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (next.getType() == 6) {
                z2 = true;
            }
            if (z2) {
                arrayList2.add(next);
            }
        }
        for (InteractStickerStruct interactStickerStruct : arrayList2) {
            try {
                Object a2 = d.b().a(interactStickerStruct.getAttr(), new b().type);
                l.b(a2, "");
                HashMap hashMap = (HashMap) a2;
                if (hashMap.get("donation_name") instanceof String) {
                    Object obj = hashMap.get("donation_name");
                    if (obj != null) {
                        str = (String) obj;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                } else {
                    str = "";
                }
                if (hashMap.get("donation_url") instanceof String) {
                    Object obj2 = hashMap.get("donation_url");
                    if (obj2 != null) {
                        str2 = (String) obj2;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                } else {
                    str2 = "";
                }
                if (hashMap.get("add_anchor_time") instanceof String) {
                    Object obj3 = hashMap.get("add_anchor_time");
                    if (obj3 != null) {
                        if (((String) obj3).length() > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            Object obj4 = hashMap.get("add_anchor_time");
                            if (obj4 != null) {
                                j2 = Long.parseLong((String) obj4);
                                arrayList.add(new CreateAnchorInfo(19, str, str2, "", jSONObject2, "https://p16.tiktokcdn.com/obj/tiktok-obj/who3x.png", Long.valueOf(j2), null, null, null, null, null, 3968, null));
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                }
                j2 = 0;
                try {
                    arrayList.add(new CreateAnchorInfo(19, str, str2, "", jSONObject2, "https://p16.tiktokcdn.com/obj/tiktok-obj/who3x.png", Long.valueOf(j2), null, null, null, null, null, 3968, null));
                } catch (Exception e3) {
                    e2 = e3;
                }
            } catch (Exception e4) {
                e2 = e4;
                h d2 = d.d();
                if (d2 != null) {
                    d2.b(e2.getMessage());
                }
            }
        }
        return arrayList;
    }

    public static final class a<T> implements Comparator {
        static {
            Covode.recordClassIndex(55673);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return h.b.a.a(Integer.valueOf(t.getRange().getStart()), Integer.valueOf(t2.getRange().getStart()));
        }
    }

    public static final TextStickerTextWrap a(String str, boolean z) {
        if (str == null || str.length() == 0) {
            return new TextStickerTextWrap(null, null, 0, false, false, 31, null);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(new TextStickerString(str), new ArrayList());
        return new TextStickerTextWrap(linkedHashMap, new TextStickerTextPair(str, new ArrayList()), 0, false, z, 12, null);
    }

    public static final TextStickerTextWrap a(EditText editText, List<InteractTextStructWrap> list) {
        if (editText == null) {
            return new TextStickerTextWrap(null, null, 0, false, false, 31, null);
        }
        String obj = editText.getText().toString();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int lineCount = editText.getLineCount();
        int i2 = 0;
        int i3 = 0;
        while (i2 < lineCount) {
            int lineEnd = editText.getLayout().getLineEnd(i2);
            Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
            String substring = obj.substring(i3, lineEnd);
            l.b(substring, "");
            TextStickerString textStickerString = new TextStickerString(substring);
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                for (T t : list) {
                    if (t.getRange().getStart() < lineEnd && t.getRange().getEnd() > i3) {
                        if (i3 >= t.getRange().getStart() && lineEnd <= t.getRange().getEnd()) {
                            arrayList.add(new InteractTextStructWrap(new TextStickerTextUnderlineIndexRange(i3 - i3, lineEnd - i3), CreateAnchorInfo.copy$default(t.getStruct(), 0, null, null, null, null, null, null, null, null, null, null, null, 4095, null)));
                        } else if (i3 >= t.getRange().getStart() && lineEnd > t.getRange().getEnd()) {
                            arrayList.add(new InteractTextStructWrap(new TextStickerTextUnderlineIndexRange(i3 - i3, t.getRange().getEnd() - i3), CreateAnchorInfo.copy$default(t.getStruct(), 0, null, null, null, null, null, null, null, null, null, null, null, 4095, null)));
                        } else if (i3 < t.getRange().getStart() && lineEnd <= t.getRange().getEnd()) {
                            arrayList.add(new InteractTextStructWrap(new TextStickerTextUnderlineIndexRange(t.getRange().getStart() - i3, lineEnd - i3), CreateAnchorInfo.copy$default(t.getStruct(), 0, null, null, null, null, null, null, null, null, null, null, null, 4095, null)));
                        } else if (i3 < t.getRange().getStart() && lineEnd > t.getRange().getEnd()) {
                            arrayList.add(new InteractTextStructWrap(new TextStickerTextUnderlineIndexRange(t.getRange().getStart() - i3, t.getRange().getEnd() - i3), CreateAnchorInfo.copy$default(t.getStruct(), 0, null, null, null, null, null, null, null, null, null, null, null, 4095, null)));
                        }
                    }
                }
            }
            if (arrayList.size() > 1) {
                n.a((List) arrayList, (Comparator) new a());
            }
            linkedHashMap.put(textStickerString, arrayList);
            editText.getLayout().getLineBounds(i2, new Rect());
            i2++;
            i3 = lineEnd;
        }
        ArrayList arrayList2 = new ArrayList();
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(InteractTextStructWrap.copy$default(it.next(), null, null, 3, null));
            }
        }
        return new TextStickerTextWrap(linkedHashMap, new TextStickerTextPair(obj, arrayList2), editText.getSelectionStart(), editText.hasFocus(), false, 16, null);
    }

    public static final void a(List<InteractTextStructWrap> list, InteractTextStructWrap interactTextStructWrap) {
        if (list.remove(interactTextStructWrap)) {
            int end = interactTextStructWrap.getRange().getEnd() - interactTextStructWrap.getRange().getStart();
            for (T t : list) {
                if (t.getRange().getStart() >= interactTextStructWrap.getRange().getEnd()) {
                    TextStickerTextUnderlineIndexRange range = t.getRange();
                    range.setStart(range.getStart() - end);
                    TextStickerTextUnderlineIndexRange range2 = t.getRange();
                    range2.setEnd(range2.getEnd() - end);
                }
            }
        }
    }

    public static final void a(List<InteractTextStructWrap> list, int i2, int i3) {
        if (list != null) {
            for (T t : list) {
                if (t.getRange().getStart() >= i2 && i3 != 0) {
                    TextStickerTextUnderlineIndexRange range = t.getRange();
                    range.setStart(range.getStart() + i3);
                    TextStickerTextUnderlineIndexRange range2 = t.getRange();
                    range2.setEnd(range2.getEnd() + i3);
                }
            }
        }
    }

    public static final int a(Paint paint, String str, int i2, int i3) {
        l.d(paint, "");
        if (str == null || str.length() == 0 || i2 < 0 || i3 > str.length() || i2 >= i3) {
            return 0;
        }
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(i2, i3);
        l.b(substring, "");
        int length = substring.length();
        float[] fArr = new float[length];
        paint.getTextWidths(substring, fArr);
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            i4 += (int) Math.ceil((double) fArr[i5]);
        }
        return i4;
    }
}
