package com.ss.android.ugc.aweme.friends.service;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.common.n;
import com.ss.android.ugc.aweme.friends.b.a;
import com.ss.android.ugc.aweme.friends.widget.contact.ContactAdapterWidget;
import com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget;
import com.ss.android.ugc.b;
import h.f.b.l;

public final class ContactServiceImpl implements IContactService {
    static {
        Covode.recordClassIndex(61655);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IContactService
    public final n a() {
        return a.f96820a;
    }

    public static IContactService b() {
        MethodCollector.i(11260);
        Object a2 = b.a(IContactService.class, false);
        if (a2 != null) {
            IContactService iContactService = (IContactService) a2;
            MethodCollector.o(11260);
            return iContactService;
        }
        if (b.bs == null) {
            synchronized (IContactService.class) {
                try {
                    if (b.bs == null) {
                        b.bs = new ContactServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(11260);
                    throw th;
                }
            }
        }
        ContactServiceImpl contactServiceImpl = (ContactServiceImpl) b.bs;
        MethodCollector.o(11260);
        return contactServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IContactService
    public final InboxAdapterWidget a(Fragment fragment, LiveData<InboxAdapterWidget.b> liveData) {
        l.d(fragment, "");
        l.d(liveData, "");
        return new ContactAdapterWidget(fragment, liveData);
    }
}
