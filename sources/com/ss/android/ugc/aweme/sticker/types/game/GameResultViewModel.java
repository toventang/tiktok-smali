package com.ss.android.ugc.aweme.sticker.types.game;

import android.util.Pair;
import androidx.lifecycle.ac;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;

public class GameResultViewModel extends ac {

    /* renamed from: a  reason: collision with root package name */
    public boolean f136075a;

    /* renamed from: b  reason: collision with root package name */
    private t<Pair<Boolean, Integer>> f136076b;

    /* renamed from: c  reason: collision with root package name */
    private t<Integer> f136077c;

    static {
        Covode.recordClassIndex(88890);
    }

    public final t<Pair<Boolean, Integer>> a() {
        if (this.f136076b == null) {
            this.f136076b = new t<>();
        }
        return this.f136076b;
    }

    public final t<Integer> b() {
        if (this.f136077c == null) {
            this.f136077c = new t<>();
        }
        return this.f136077c;
    }
}
