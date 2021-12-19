package com.ss.android.ugc.aweme.playerkit.configpickerimpl.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.playerkit.a.f;
import com.ss.android.ugc.aweme.playerkit.configpickerimpl.data.ConditionConfig;
import java.util.Arrays;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public f f115506a;

    /* renamed from: b  reason: collision with root package name */
    public List<String> f115507b;

    static {
        Covode.recordClassIndex(74143);
    }

    public final String a(List<String> list) {
        int size = list.size();
        char[] cArr = new char[size];
        for (int i2 = 0; i2 < size; i2++) {
            int indexOf = this.f115507b.indexOf(list.get(i2));
            if (indexOf < 0) {
                return null;
            }
            cArr[i2] = (char) (indexOf + 48);
        }
        Arrays.sort(cArr);
        return new String(cArr);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public ConditionConfig f115509a;

        /* renamed from: b  reason: collision with root package name */
        public String f115510b;

        static {
            Covode.recordClassIndex(74145);
        }

        public a(ConditionConfig conditionConfig, String str) {
            this.f115509a = conditionConfig;
            this.f115510b = str;
        }
    }
}
