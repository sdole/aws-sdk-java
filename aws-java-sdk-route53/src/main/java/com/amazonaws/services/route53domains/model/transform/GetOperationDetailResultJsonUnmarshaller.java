/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.route53domains.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.route53domains.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetOperationDetailResult JSON Unmarshaller
 */
public class GetOperationDetailResultJsonUnmarshaller implements
        Unmarshaller<GetOperationDetailResult, JsonUnmarshallerContext> {

    public GetOperationDetailResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        GetOperationDetailResult getOperationDetailResult = new GetOperationDetailResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL)
            return null;

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("OperationId", targetDepth)) {
                    context.nextToken();
                    getOperationDetailResult
                            .setOperationId(StringJsonUnmarshaller
                                    .getInstance().unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    getOperationDetailResult.setStatus(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("Message", targetDepth)) {
                    context.nextToken();
                    getOperationDetailResult.setMessage(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("DomainName", targetDepth)) {
                    context.nextToken();
                    getOperationDetailResult
                            .setDomainName(StringJsonUnmarshaller.getInstance()
                                    .unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    context.nextToken();
                    getOperationDetailResult.setType(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("SubmittedDate", targetDepth)) {
                    context.nextToken();
                    getOperationDetailResult
                            .setSubmittedDate(DateJsonUnmarshaller
                                    .getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null
                        || context.getLastParsedParentElement().equals(
                                currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getOperationDetailResult;
    }

    private static GetOperationDetailResultJsonUnmarshaller instance;

    public static GetOperationDetailResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetOperationDetailResultJsonUnmarshaller();
        return instance;
    }
}
