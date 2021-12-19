package com.ss.android.ugc.aweme.music.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.musicprovider.a;
import h.f.b.l;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public String f112027a;

    /* renamed from: b  reason: collision with root package name */
    public MusicWaveBean f112028b;

    /* renamed from: c  reason: collision with root package name */
    public Integer f112029c;

    /* renamed from: d  reason: collision with root package name */
    public a f112030d;

    /* renamed from: e  reason: collision with root package name */
    public Effect f112031e;

    /* renamed from: f  reason: collision with root package name */
    public Integer f112032f;

    /* renamed from: g  reason: collision with root package name */
    public ExceptionResult f112033g;

    static {
        Covode.recordClassIndex(71995);
    }

    public q() {
        this(null, null, null, null, null, null, null, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return l.a(this.f112027a, qVar.f112027a) && l.a(this.f112028b, qVar.f112028b) && l.a(this.f112029c, qVar.f112029c) && l.a(this.f112030d, qVar.f112030d) && l.a(this.f112031e, qVar.f112031e) && l.a(this.f112032f, qVar.f112032f) && l.a(this.f112033g, qVar.f112033g);
    }

    public final int hashCode() {
        String str = this.f112027a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        MusicWaveBean musicWaveBean = this.f112028b;
        int hashCode2 = (hashCode + (musicWaveBean != null ? musicWaveBean.hashCode() : 0)) * 31;
        Integer num = this.f112029c;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        a aVar = this.f112030d;
        int hashCode4 = (hashCode3 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        Effect effect = this.f112031e;
        int hashCode5 = (hashCode4 + (effect != null ? effect.hashCode() : 0)) * 31;
        Integer num2 = this.f112032f;
        int hashCode6 = (hashCode5 + (num2 != null ? num2.hashCode() : 0)) * 31;
        ExceptionResult exceptionResult = this.f112033g;
        if (exceptionResult != null) {
            i2 = exceptionResult.hashCode();
        }
        return hashCode6 + i2;
    }

    public final String toString() {
        return "MusicAndEffectResult(musicFile=" + this.f112027a + ", waveBean=" + this.f112028b + ", musicStatus=" + this.f112029c + ", musicDownloadException=" + this.f112030d + ", effect=" + this.f112031e + ", effectStatus=" + this.f112032f + ", effectExceptionResult=" + this.f112033g + ")";
    }

    public q(String str, MusicWaveBean musicWaveBean, Integer num, a aVar, Effect effect, Integer num2, ExceptionResult exceptionResult) {
        this.f112027a = str;
        this.f112028b = musicWaveBean;
        this.f112029c = num;
        this.f112030d = aVar;
        this.f112031e = effect;
        this.f112032f = num2;
        this.f112033g = exceptionResult;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(String str, MusicWaveBean musicWaveBean, Integer num, a aVar, Effect effect, Integer num2, ExceptionResult exceptionResult, int i2) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : musicWaveBean, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : aVar, (i2 & 16) != 0 ? null : effect, (i2 & 32) != 0 ? null : num2, (i2 & 64) == 0 ? exceptionResult : null);
    }
}
