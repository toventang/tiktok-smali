package com.bytedance.geckox.policy.loop;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.policy.loop.model.LoopRequestModel;
import com.bytedance.geckox.settings.model.GlobalConfigSettings;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public int f29994a;

    /* renamed from: b  reason: collision with root package name */
    public Map<String, LoopRequestModel> f29995b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    public a f29996c;

    /* renamed from: d  reason: collision with root package name */
    private Handler f29997d;

    /* renamed from: e  reason: collision with root package name */
    private String f29998e;

    /* renamed from: f  reason: collision with root package name */
    private AtomicBoolean f29999f = new AtomicBoolean(false);

    public interface a {
        static {
            Covode.recordClassIndex(17405);
        }

        void a(Map<String, LoopRequestModel> map);
    }

    static {
        Covode.recordClassIndex(17403);
    }

    public final void b() {
        this.f29999f.set(false);
        this.f29997d.removeMessages(this.f29994a);
        this.f29995b.clear();
    }

    public final void c() {
        this.f29999f.set(true);
        Message obtainMessage = this.f29997d.obtainMessage();
        obtainMessage.what = this.f29994a;
        obtainMessage.arg1 = 3;
        this.f29997d.sendMessageDelayed(obtainMessage, (long) (this.f29994a * 1000));
    }

    public final void a() {
        int i2 = this.f29994a;
        if (i2 != 0 && !this.f29997d.hasMessages(i2) && !this.f29999f.get()) {
            com.bytedance.geckox.i.a.a("[loop]start loop,interval level:", this.f29998e, ",combine deployments:", this.f29995b);
            c();
        }
    }

    private LoopRequestModel a(String str) {
        LoopRequestModel loopRequestModel = this.f29995b.get(str);
        if (loopRequestModel == null) {
            return new LoopRequestModel(new HashMap(), new LoopRequestModel.LoopDeploymentModel());
        }
        return loopRequestModel;
    }

    public final void a(int i2) {
        if (this.f29994a != i2) {
            if (this.f29999f.get()) {
                this.f29997d.removeMessages(this.f29994a);
                this.f29999f.set(false);
            }
            this.f29994a = i2;
            a();
        }
    }

    public final void a(List<GlobalConfigSettings.SyncItem> list) {
        if (!(list == null || list.isEmpty())) {
            for (GlobalConfigSettings.SyncItem syncItem : list) {
                a(syncItem.getAccessKey(), syncItem.getGroup(), syncItem.getTarget());
            }
        }
    }

    public c(String str, int i2) {
        this.f29998e = str;
        this.f29994a = i2;
        HandlerThread handlerThread = new HandlerThread("combine", 3);
        handlerThread.start();
        this.f29997d = new Handler(handlerThread.getLooper()) {
            /* class com.bytedance.geckox.policy.loop.c.AnonymousClass1 */

            static {
                Covode.recordClassIndex(17404);
            }

            public final void handleMessage(Message message) {
                super.handleMessage(message);
                if (message.arg1 == 3) {
                    com.bytedance.geckox.i.a.a("[loop]loop msg.what:", Integer.valueOf(message.what), "interval:", Integer.valueOf(c.this.f29994a), "time:", Long.valueOf(System.currentTimeMillis()));
                    if (c.this.f29995b != null && !c.this.f29995b.isEmpty()) {
                        if (c.this.f29996c != null) {
                            c.this.f29996c.a(c.this.f29995b);
                        }
                        c.this.c();
                    }
                }
            }
        };
    }

    private void a(String str, List<String> list, List<String> list2) {
        LoopRequestModel a2 = a(str);
        if (list != null) {
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2) && !a2.getDeployment().getGroupName().contains(str2)) {
                    a2.getDeployment().getGroupName().add(str2);
                }
            }
        }
        if (list2 != null) {
            for (String str3 : list2) {
                Iterator<CheckRequestBodyModel.TargetChannel> it = a2.getDeployment().getTargetChannels().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().channelName.equals(str3)) {
                            break;
                        }
                    } else {
                        a2.getDeployment().getTargetChannels().add(new CheckRequestBodyModel.TargetChannel(str3));
                        break;
                    }
                }
            }
        }
        this.f29995b.put(str, a2);
    }

    public final void a(String str, List<String> list, Map<String, List<CheckRequestBodyModel.TargetChannel>> map, Map<String, Map<String, Object>> map2) {
        if (map != null) {
            for (String str2 : map.keySet()) {
                LoopRequestModel a2 = a(str2);
                if (!TextUtils.isEmpty(str) && !"default".equals(str) && !a2.getDeployment().getGroupName().contains(str)) {
                    a2.getDeployment().getGroupName().add(str);
                }
                if (!(map2 == null || map2.get(str2) == null)) {
                    a2.getCustom().putAll(map2.get(str2));
                }
                List<CheckRequestBodyModel.TargetChannel> list2 = map.get(str2);
                if (list2 == null || list2.isEmpty()) {
                    this.f29995b.put(str2, a2);
                } else {
                    for (CheckRequestBodyModel.TargetChannel targetChannel : list2) {
                        Iterator<CheckRequestBodyModel.TargetChannel> it = a2.getDeployment().getTargetChannels().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (it.next().channelName.equals(targetChannel.channelName)) {
                                    break;
                                }
                            } else {
                                a2.getDeployment().getTargetChannels().add(targetChannel);
                                break;
                            }
                        }
                    }
                    this.f29995b.put(str2, a2);
                }
            }
        } else if (!TextUtils.isEmpty(str) && !"default".equals(str) && list != null && !list.isEmpty()) {
            for (String str3 : list) {
                LoopRequestModel a3 = a(str3);
                if (!TextUtils.isEmpty(str) && !a3.getDeployment().getGroupName().contains(str)) {
                    a3.getDeployment().getGroupName().add(str);
                }
                if (!(map2 == null || map2.get(str3) == null)) {
                    a3.getCustom().putAll(map2.get(str3));
                }
                this.f29995b.put(str3, a3);
            }
        }
    }
}
