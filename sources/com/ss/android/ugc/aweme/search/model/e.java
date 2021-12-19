package com.ss.android.ugc.aweme.search.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import java.util.List;
import java.util.Map;

public class e {
    @c(a = "sug_type")

    /* renamed from: a  reason: collision with root package name */
    public String f121518a;
    @c(a = "content")

    /* renamed from: b  reason: collision with root package name */
    public String f121519b;
    @c(a = "pos")

    /* renamed from: c  reason: collision with root package name */
    public List<Position> f121520c;
    @c(a = "highlight_pos")

    /* renamed from: d  reason: collision with root package name */
    public List<Position> f121521d;
    @c(a = "rich_sug_sec_pos")

    /* renamed from: e  reason: collision with root package name */
    public List<Position> f121522e;
    @c(a = "word_record")

    /* renamed from: f  reason: collision with root package name */
    public Word f121523f;
    @c(a = "extra_info")

    /* renamed from: g  reason: collision with root package name */
    public i f121524g;

    /* renamed from: h  reason: collision with root package name */
    public transient int f121525h;

    /* renamed from: i  reason: collision with root package name */
    public transient int f121526i = -1;

    /* renamed from: j  reason: collision with root package name */
    public boolean f121527j;

    /* renamed from: k  reason: collision with root package name */
    public Map<String, String> f121528k;

    static {
        Covode.recordClassIndex(79158);
    }

    public final boolean b() {
        return TextUtils.equals(this.f121518a, "history");
    }

    public final boolean a() {
        i iVar = this.f121524g;
        if (iVar == null) {
            return false;
        }
        return "2".equals(iVar.getWordsType());
    }
}
