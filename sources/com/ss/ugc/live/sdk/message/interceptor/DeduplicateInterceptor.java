package com.ss.ugc.live.sdk.message.interceptor;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.data.LimitedSizeHashMap;
import com.ss.ugc.live.sdk.message.interfaces.IInterceptor;
import java.util.Map;

public class DeduplicateInterceptor implements IInterceptor {
    private Map<Long, Object> mBufferMap;
    private Map<Long, Object> mPipBufferMap;

    static {
        Covode.recordClassIndex(102776);
    }

    public void clear() {
        this.mBufferMap.clear();
        this.mPipBufferMap.clear();
    }

    public DeduplicateInterceptor(int i2) {
        this.mBufferMap = new LimitedSizeHashMap(i2);
        this.mPipBufferMap = new LimitedSizeHashMap(i2);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IInterceptor
    public boolean onMessage(IMessage iMessage) {
        if (iMessage.getGeneralMessageType() == 1) {
            if (this.mPipBufferMap.containsKey(Long.valueOf(iMessage.getMessageId()))) {
                return true;
            }
            this.mPipBufferMap.put(Long.valueOf(iMessage.getMessageId()), null);
            return false;
        } else if (this.mBufferMap.containsKey(Long.valueOf(iMessage.getMessageId()))) {
            return true;
        } else {
            this.mBufferMap.put(Long.valueOf(iMessage.getMessageId()), null);
            return false;
        }
    }
}
