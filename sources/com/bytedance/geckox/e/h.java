package com.bytedance.geckox.e;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.f;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.policy.b.a;
import com.bytedance.geckox.settings.model.GlobalConfigSettings;
import com.bytedance.q.b;
import com.bytedance.q.d;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class h extends d<List<UpdatePackage>, List<UpdatePackage>> {
    static {
        Covode.recordClassIndex(17303);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.q.b, java.lang.Object] */
    @Override // com.bytedance.q.d
    public final /* synthetic */ Object a(b<List<UpdatePackage>> bVar, List<UpdatePackage> list) {
        List<UpdatePackage> list2 = list;
        GlobalConfigSettings e2 = f.a().e();
        if (!(e2 == null || e2.getReqMeta() == null || e2.getReqMeta().getLazy() == null)) {
            Map<String, GlobalConfigSettings.LazyItem> lazy = e2.getReqMeta().getLazy();
            for (int size = list2.size() - 1; size >= 0; size--) {
                UpdatePackage updatePackage = list2.get(size);
                String accessKey = updatePackage.getAccessKey();
                if (lazy.containsKey(accessKey)) {
                    GlobalConfigSettings.LazyItem lazyItem = lazy.get(accessKey);
                    String groupName = updatePackage.getGroupName();
                    String channel = updatePackage.getChannel();
                    if (!(TextUtils.isEmpty(groupName) || lazyItem.getGroups() == null || !lazyItem.getGroups().contains(groupName)) || (a.f29951a != null && a.f29951a.containsKey(accessKey + "-" + channel))) {
                        String str = accessKey + "-" + groupName;
                        if (a.f29952b == null) {
                            a.f29952b = new ConcurrentHashMap();
                        }
                        a.f29952b.put(str, updatePackage);
                        a.a(accessKey + "-" + channel, updatePackage);
                        list2.remove(size);
                    } else if (lazyItem.getChannels() != null && lazyItem.getChannels().contains(channel)) {
                        a.a(accessKey + "-" + channel, updatePackage);
                        list2.remove(size);
                    }
                }
            }
        }
        if (list2.size() == 0) {
            return null;
        }
        return bVar.a(list2);
    }
}
