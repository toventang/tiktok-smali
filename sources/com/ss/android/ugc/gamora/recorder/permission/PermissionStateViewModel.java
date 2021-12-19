package com.ss.android.ugc.gamora.recorder.permission;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.p;
import h.f.b.l;
import h.f.b.m;

public final class PermissionStateViewModel extends BaseJediViewModel<PermissionState> {
    static {
        Covode.recordClassIndex(97660);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new PermissionState(null, null, 3, null);
    }

    public static final class a extends m implements h.f.a.b<PermissionState, PermissionState> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f148171a = new a();

        static {
            Covode.recordClassIndex(97661);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ PermissionState invoke(PermissionState permissionState) {
            PermissionState permissionState2 = permissionState;
            l.d(permissionState2, "");
            return PermissionState.copy$default(permissionState2, new p(), null, 2, null);
        }
    }

    public static final class b extends m implements h.f.a.b<PermissionState, PermissionState> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f148172a = new b();

        static {
            Covode.recordClassIndex(97662);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ PermissionState invoke(PermissionState permissionState) {
            PermissionState permissionState2 = permissionState;
            l.d(permissionState2, "");
            return PermissionState.copy$default(permissionState2, null, new p(), 1, null);
        }
    }
}
