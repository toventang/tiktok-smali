package com.ss.android.ugc.aweme.initializer;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.services.IStorageManagerService;

public final class StorageManagerService implements IStorageManagerService {

    /* renamed from: a  reason: collision with root package name */
    public static final a f104723a = new a((byte) 0);

    static {
        Covode.recordClassIndex(67131);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(67132);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IStorageManagerService
    public final void launchDiskManagerActivity() {
        SmartRouter.buildRoute(d.a(), "//setting/diskmanager").addFlags(268435456).open();
    }
}
