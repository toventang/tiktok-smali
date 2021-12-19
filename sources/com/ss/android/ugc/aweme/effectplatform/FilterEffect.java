package com.ss.android.ugc.aweme.effectplatform;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.g;
import h.f.b.l;

public final class FilterEffect extends Effect implements Parcelable {
    public static final Parcelable.Creator<FilterEffect> CREATOR = new b();
    public static final a Companion = new a((byte) 0);
    @c(a = "is_buildin")
    private boolean buildIn;
    @c(a = "is_checked")
    private boolean checked;
    private final com.ss.ugc.effectplatform.model.Effect kEffect;

    public FilterEffect() {
        this(null, 1, null);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate, com.ss.ugc.effectplatform.model.Effect
    public final int describeContents() {
        return 0;
    }

    public final int getInt(boolean z) {
        return z ? 1 : 0;
    }

    public final int toInt(boolean z) {
        return z ? 1 : 0;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(55985);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b implements Parcelable.Creator<FilterEffect> {
        static {
            Covode.recordClassIndex(55986);
        }

        b() {
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ FilterEffect[] newArray(int i2) {
            return new FilterEffect[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ FilterEffect createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        private static FilterEffect a(Parcel parcel) {
            boolean z;
            Object obj;
            l.d(parcel, "");
            com.ss.ugc.effectplatform.model.Effect effect = null;
            try {
                Object obj2 = com.ss.ugc.effectplatform.model.Effect.class.getField("CREATOR").get(null);
                if (!(obj2 instanceof Parcelable.Creator)) {
                    obj2 = null;
                }
                Parcelable.Creator creator = (Parcelable.Creator) obj2;
                if (creator != null) {
                    obj = creator.createFromParcel(parcel);
                } else {
                    obj = null;
                }
                if (!(obj instanceof com.ss.ugc.effectplatform.model.Effect)) {
                    obj = null;
                }
                effect = (com.ss.ugc.effectplatform.model.Effect) obj;
            } catch (Exception unused) {
            }
            FilterEffect filterEffect = new FilterEffect(effect);
            boolean z2 = true;
            if (parcel.readByte() != 0) {
                z = true;
            } else {
                z = false;
            }
            filterEffect.setChecked(z);
            if (parcel.readByte() == 0) {
                z2 = false;
            }
            filterEffect.setBuildIn(z2);
            return filterEffect;
        }
    }

    public final boolean getBuildIn() {
        return this.buildIn;
    }

    public final boolean getChecked() {
        return this.checked;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate, com.ss.android.ugc.effectmanager.effect.model.Effect
    public final com.ss.ugc.effectplatform.model.Effect getKEffect() {
        return this.kEffect;
    }

    static {
        Covode.recordClassIndex(55984);
    }

    public final void setBuildIn(boolean z) {
        this.buildIn = z;
    }

    public final void setChecked(boolean z) {
        this.checked = z;
    }

    public FilterEffect(com.ss.ugc.effectplatform.model.Effect effect) {
        super(effect);
        this.kEffect = effect;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate, com.ss.ugc.effectplatform.model.Effect, com.ss.android.ugc.effectmanager.effect.model.Effect
    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        if (getKEffect() != null) {
            getKEffect().writeToParcel(parcel, i2);
        } else {
            super.writeToParcel(parcel, i2);
        }
        parcel.writeByte((byte) getInt(this.checked));
        parcel.writeByte((byte) getInt(this.checked));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FilterEffect(com.ss.ugc.effectplatform.model.Effect effect, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : effect);
    }
}
