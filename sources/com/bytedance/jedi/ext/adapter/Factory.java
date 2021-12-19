package com.bytedance.jedi.ext.adapter;

import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.af;
import h.f.b.g;
import h.f.b.l;
import h.z;

public final class Factory implements ad.b {
    static {
        Covode.recordClassIndex(24358);
    }

    static final class ViewModel extends JediViewModel<SimpleViewHolderState> {
        static {
            Covode.recordClassIndex(24360);
        }

        /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
        @Override // com.bytedance.jedi.arch.JediViewModel
        public final /* synthetic */ SimpleViewHolderState d() {
            return new SimpleViewHolderState(null, 1, null);
        }
    }

    static final class SimpleViewHolderState implements af {
        private final z trigger;

        static {
            Covode.recordClassIndex(24359);
        }

        public SimpleViewHolderState() {
            this(null, 1, null);
        }

        private final void component1() {
        }

        public static /* synthetic */ SimpleViewHolderState copy$default(SimpleViewHolderState simpleViewHolderState, z zVar, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                zVar = simpleViewHolderState.trigger;
            }
            return simpleViewHolderState.copy(zVar);
        }

        public final SimpleViewHolderState copy(z zVar) {
            l.c(zVar, "");
            return new SimpleViewHolderState(zVar);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof SimpleViewHolderState) && l.a(this.trigger, ((SimpleViewHolderState) obj).trigger);
            }
            return true;
        }

        public final int hashCode() {
            z zVar = this.trigger;
            if (zVar != null) {
                return zVar.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "SimpleViewHolderState(trigger=" + this.trigger + ")";
        }

        public SimpleViewHolderState(z zVar) {
            l.c(zVar, "");
            this.trigger = zVar;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ SimpleViewHolderState(z zVar, int i2, g gVar) {
            this((i2 & 1) != 0 ? z.f158842a : zVar);
        }
    }

    @Override // androidx.lifecycle.ad.b
    public final <T extends ac> T a(Class<T> cls) {
        l.c(cls, "");
        return new ViewModel();
    }
}
