/*
 * Copyright (c) 2008-2015, Hazelcast, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hazelcast.transaction.client;

import com.hazelcast.transaction.impl.Transaction;

public class PrepareXATransactionRequest extends BaseXATransactionRequest {

    public PrepareXATransactionRequest() {
    }

    public PrepareXATransactionRequest(String txnId) {
        super(txnId);
    }

    @Override
    public Object call() throws Exception {
        Transaction transaction = getTransaction();
        transaction.prepare();
        return null;
    }

    @Override
    public int getClassId() {
        return ClientTxnPortableHook.PREPARE_XA;
    }
}
