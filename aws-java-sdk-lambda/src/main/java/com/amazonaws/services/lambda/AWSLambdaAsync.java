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
package com.amazonaws.services.lambda;

import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.services.lambda.model.*;

/**
 * Interface for accessing AWSLambda asynchronously.
 * Each asynchronous method will return a Java Future object, and users are also allowed
 * to provide a callback handler.
 * AWS Lambda <p>
 * <b>Overview</b>
 * </p>
 * <p>
 * This is the <i>AWS Lambda API Reference</i> .
 * The AWS Lambda Developer Guide provides additional information.
 * For the service overview, go to
 * <a href="http://docs.aws.amazon.com/lambda/latest/dg/welcome.html"> What is AWS Lambda </a> , and for information about how the service works, go to <a href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html"> AWS Lambda: How it Works </a>
 * in the <i>AWS Lambda Developer Guide</i> .
 * </p>
 */
public interface AWSLambdaAsync extends AWSLambda {
    /**
     * <p>
     * Using this API you can update function version to which the alias
     * points to and alias description. For more information, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-v2-intro-aliases.html"> Introduction to AWS Lambda Aliases </a>
     * 
     * </p>
     * <p>
     * This requires permission for the lambda:UpdateAlias action.
     * </p>
     *
     * @param updateAliasRequest Container for the necessary parameters to
     *           execute the UpdateAlias operation on AWSLambda.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateAlias service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateAliasResult> updateAliasAsync(UpdateAliasRequest updateAliasRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Using this API you can update function version to which the alias
     * points to and alias description. For more information, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-v2-intro-aliases.html"> Introduction to AWS Lambda Aliases </a>
     * 
     * </p>
     * <p>
     * This requires permission for the lambda:UpdateAlias action.
     * </p>
     *
     * @param updateAliasRequest Container for the necessary parameters to
     *           execute the UpdateAlias operation on AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateAlias service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateAliasResult> updateAliasAsync(UpdateAliasRequest updateAliasRequest,
            AsyncHandler<UpdateAliasRequest, UpdateAliasResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified Lambda function code and configuration.
     * </p>
     * <p>
     * If you don't specify a function version, AWS Lambda will delete the
     * function, including all its versions, and any aliases pointing to the
     * function versions.
     * </p>
     * <p>
     * When you delete a function the associated resource policy is also
     * deleted. You will need to delete the event source mappings explicitly.
     * </p>
     * <p>
     * For information about function versioning, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases-v2.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:DeleteFunction</code> action.
     * </p>
     *
     * @param deleteFunctionRequest Container for the necessary parameters to
     *           execute the DeleteFunction operation on AWSLambda.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteFunction service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteFunctionAsync(DeleteFunctionRequest deleteFunctionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified Lambda function code and configuration.
     * </p>
     * <p>
     * If you don't specify a function version, AWS Lambda will delete the
     * function, including all its versions, and any aliases pointing to the
     * function versions.
     * </p>
     * <p>
     * When you delete a function the associated resource policy is also
     * deleted. You will need to delete the event source mappings explicitly.
     * </p>
     * <p>
     * For information about function versioning, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases-v2.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:DeleteFunction</code> action.
     * </p>
     *
     * @param deleteFunctionRequest Container for the necessary parameters to
     *           execute the DeleteFunction operation on AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteFunction service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteFunctionAsync(DeleteFunctionRequest deleteFunctionRequest,
            AsyncHandler<DeleteFunctionRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds a permission to the resource policy associated with the
     * specified AWS Lambda function. You use resource policies to grant
     * permissions to event sources that use "push" model. In "push" model,
     * event sources (such as Amazon S3 and custom applications) invoke your
     * Lambda function. Each permission you add to the resource policy allows
     * an event source, permission to invoke the Lambda function.
     * </p>
     * <p>
     * For information about the push model, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html"> AWS Lambda: How it Works </a>
     * .
     * </p>
     * <p>
     * If you are using versioning feature (see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases-v2.html"> AWS Lambda Function Versioning and Aliases </a>
     * ), a Lambda function can have multiple ARNs that can be used to
     * invoke the function. Note that, each permission you add to resource
     * policy using this API is specific to an ARN, specified using the
     * <code>Qualifier</code> parameter
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:AddPermission</code> action.
     * </p>
     *
     * @param addPermissionRequest Container for the necessary parameters to
     *           execute the AddPermission operation on AWSLambda.
     * 
     * @return A Java Future object containing the response from the
     *         AddPermission service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AddPermissionResult> addPermissionAsync(AddPermissionRequest addPermissionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds a permission to the resource policy associated with the
     * specified AWS Lambda function. You use resource policies to grant
     * permissions to event sources that use "push" model. In "push" model,
     * event sources (such as Amazon S3 and custom applications) invoke your
     * Lambda function. Each permission you add to the resource policy allows
     * an event source, permission to invoke the Lambda function.
     * </p>
     * <p>
     * For information about the push model, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html"> AWS Lambda: How it Works </a>
     * .
     * </p>
     * <p>
     * If you are using versioning feature (see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases-v2.html"> AWS Lambda Function Versioning and Aliases </a>
     * ), a Lambda function can have multiple ARNs that can be used to
     * invoke the function. Note that, each permission you add to resource
     * policy using this API is specific to an ARN, specified using the
     * <code>Qualifier</code> parameter
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:AddPermission</code> action.
     * </p>
     *
     * @param addPermissionRequest Container for the necessary parameters to
     *           execute the AddPermission operation on AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         AddPermission service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AddPermissionResult> addPermissionAsync(AddPermissionRequest addPermissionRequest,
            AsyncHandler<AddPermissionRequest, AddPermissionResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of your Lambda functions. For each function, the
     * response includes the function configuration information. You must use
     * GetFunction to retrieve the code for your function.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:ListFunctions</code> action.
     * </p>
     *
     * @param listFunctionsRequest Container for the necessary parameters to
     *           execute the ListFunctions operation on AWSLambda.
     * 
     * @return A Java Future object containing the response from the
     *         ListFunctions service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListFunctionsResult> listFunctionsAsync(ListFunctionsRequest listFunctionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of your Lambda functions. For each function, the
     * response includes the function configuration information. You must use
     * GetFunction to retrieve the code for your function.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:ListFunctions</code> action.
     * </p>
     *
     * @param listFunctionsRequest Container for the necessary parameters to
     *           execute the ListFunctions operation on AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListFunctions service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListFunctionsResult> listFunctionsAsync(ListFunctionsRequest listFunctionsRequest,
            AsyncHandler<ListFunctionsRequest, ListFunctionsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the specified alias information such as the alias ARN,
     * description, and function version it is pointing to. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-v2-intro-aliases.html"> Introduction to AWS Lambda Aliases </a>
     * 
     * </p>
     * <p>
     * This requires permission for the lambda:GetAlias action.
     * </p>
     *
     * @param getAliasRequest Container for the necessary parameters to
     *           execute the GetAlias operation on AWSLambda.
     * 
     * @return A Java Future object containing the response from the GetAlias
     *         service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetAliasResult> getAliasAsync(GetAliasRequest getAliasRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the specified alias information such as the alias ARN,
     * description, and function version it is pointing to. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-v2-intro-aliases.html"> Introduction to AWS Lambda Aliases </a>
     * 
     * </p>
     * <p>
     * This requires permission for the lambda:GetAlias action.
     * </p>
     *
     * @param getAliasRequest Container for the necessary parameters to
     *           execute the GetAlias operation on AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the GetAlias
     *         service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetAliasResult> getAliasAsync(GetAliasRequest getAliasRequest,
            AsyncHandler<GetAliasRequest, GetAliasResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * You can remove individual permissions from an resource policy
     * associated with a Lambda function by providing a statement ID that you
     * provided when you addded the permission. The API removes corresponding
     * permission that is associated with the specific ARN identified by the
     * <code>Qualifier</code> parameter.
     * </p>
     * <p>
     * Note that removal of a permission will cause an active event source
     * to lose permission to the function.
     * </p>
     * <p>
     * You need permission for the <code>lambda:RemovePermission</code>
     * action.
     * </p>
     *
     * @param removePermissionRequest Container for the necessary parameters
     *           to execute the RemovePermission operation on AWSLambda.
     * 
     * @return A Java Future object containing the response from the
     *         RemovePermission service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> removePermissionAsync(RemovePermissionRequest removePermissionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * You can remove individual permissions from an resource policy
     * associated with a Lambda function by providing a statement ID that you
     * provided when you addded the permission. The API removes corresponding
     * permission that is associated with the specific ARN identified by the
     * <code>Qualifier</code> parameter.
     * </p>
     * <p>
     * Note that removal of a permission will cause an active event source
     * to lose permission to the function.
     * </p>
     * <p>
     * You need permission for the <code>lambda:RemovePermission</code>
     * action.
     * </p>
     *
     * @param removePermissionRequest Container for the necessary parameters
     *           to execute the RemovePermission operation on AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RemovePermission service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> removePermissionAsync(RemovePermissionRequest removePermissionRequest,
            AsyncHandler<RemovePermissionRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new Lambda function. The function metadata is created from
     * the request parameters, and the code for the function is provided by a
     * .zip file in the request body. If the function name already exists,
     * the operation will fail. Note that the function name is
     * case-sensitive.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:CreateFunction</code> action.
     * </p>
     *
     * @param createFunctionRequest Container for the necessary parameters to
     *           execute the CreateFunction operation on AWSLambda.
     * 
     * @return A Java Future object containing the response from the
     *         CreateFunction service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateFunctionResult> createFunctionAsync(CreateFunctionRequest createFunctionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new Lambda function. The function metadata is created from
     * the request parameters, and the code for the function is provided by a
     * .zip file in the request body. If the function name already exists,
     * the operation will fail. Note that the function name is
     * case-sensitive.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:CreateFunction</code> action.
     * </p>
     *
     * @param createFunctionRequest Container for the necessary parameters to
     *           execute the CreateFunction operation on AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateFunction service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateFunctionResult> createFunctionAsync(CreateFunctionRequest createFunctionRequest,
            AsyncHandler<CreateFunctionRequest, CreateFunctionResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * You can update an event source mapping. This is useful if you want to
     * change the parameters of the existing mapping without losing your
     * position in the stream. You can change which function will receive the
     * stream records, but to change the stream itself, you must create a new
     * mapping.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:UpdateEventSourceMapping</code> action.
     * </p>
     *
     * @param updateEventSourceMappingRequest Container for the necessary
     *           parameters to execute the UpdateEventSourceMapping operation on
     *           AWSLambda.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateEventSourceMapping service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateEventSourceMappingResult> updateEventSourceMappingAsync(UpdateEventSourceMappingRequest updateEventSourceMappingRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * You can update an event source mapping. This is useful if you want to
     * change the parameters of the existing mapping without losing your
     * position in the stream. You can change which function will receive the
     * stream records, but to change the stream itself, you must create a new
     * mapping.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:UpdateEventSourceMapping</code> action.
     * </p>
     *
     * @param updateEventSourceMappingRequest Container for the necessary
     *           parameters to execute the UpdateEventSourceMapping operation on
     *           AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateEventSourceMapping service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateEventSourceMappingResult> updateEventSourceMappingAsync(UpdateEventSourceMappingRequest updateEventSourceMappingRequest,
            AsyncHandler<UpdateEventSourceMappingRequest, UpdateEventSourceMappingResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Publishes a version of your function from the current snapshot of
     * HEAD. That is, AWS Lambda takes a snapshot of the function code and
     * configuration information from HEAD and publishes a new version. The
     * code and <code>handler</code> of this specific Lambda function version
     * cannot be modified after publication, but you can modify the
     * configuration information.
     * </p>
     *
     * @param publishVersionRequest Container for the necessary parameters to
     *           execute the PublishVersion operation on AWSLambda.
     * 
     * @return A Java Future object containing the response from the
     *         PublishVersion service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<PublishVersionResult> publishVersionAsync(PublishVersionRequest publishVersionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Publishes a version of your function from the current snapshot of
     * HEAD. That is, AWS Lambda takes a snapshot of the function code and
     * configuration information from HEAD and publishes a new version. The
     * code and <code>handler</code> of this specific Lambda function version
     * cannot be modified after publication, but you can modify the
     * configuration information.
     * </p>
     *
     * @param publishVersionRequest Container for the necessary parameters to
     *           execute the PublishVersion operation on AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         PublishVersion service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<PublishVersionResult> publishVersionAsync(PublishVersionRequest publishVersionRequest,
            AsyncHandler<PublishVersionRequest, PublishVersionResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * <b>IMPORTANT:</b>This API is deprecated. We recommend you use Invoke
     * API (see Invoke).
     * </p>
     * <p>
     * Submits an invocation request to AWS Lambda. Upon receiving the
     * request, Lambda executes the specified function asynchronously. To see
     * the logs generated by the Lambda function execution, see the
     * CloudWatch logs console.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:InvokeFunction</code> action.
     * </p>
     *
     * @param invokeAsyncRequest Container for the necessary parameters to
     *           execute the InvokeAsync operation on AWSLambda.
     * 
     * @return A Java Future object containing the response from the
     *         InvokeAsync service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    @Deprecated
    public Future<InvokeAsyncResult> invokeAsyncAsync(InvokeAsyncRequest invokeAsyncRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * <b>IMPORTANT:</b>This API is deprecated. We recommend you use Invoke
     * API (see Invoke).
     * </p>
     * <p>
     * Submits an invocation request to AWS Lambda. Upon receiving the
     * request, Lambda executes the specified function asynchronously. To see
     * the logs generated by the Lambda function execution, see the
     * CloudWatch logs console.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:InvokeFunction</code> action.
     * </p>
     *
     * @param invokeAsyncRequest Container for the necessary parameters to
     *           execute the InvokeAsync operation on AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         InvokeAsync service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<InvokeAsyncResult> invokeAsyncAsync(InvokeAsyncRequest invokeAsyncRequest,
            AsyncHandler<InvokeAsyncRequest, InvokeAsyncResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the configuration parameters for the specified Lambda
     * function by using the values provided in the request. You provide only
     * the parameters you want to change. This operation must only be used on
     * an existing Lambda function and cannot be used to update the
     * function's code.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:UpdateFunctionConfiguration</code> action.
     * </p>
     *
     * @param updateFunctionConfigurationRequest Container for the necessary
     *           parameters to execute the UpdateFunctionConfiguration operation on
     *           AWSLambda.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateFunctionConfiguration service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateFunctionConfigurationResult> updateFunctionConfigurationAsync(UpdateFunctionConfigurationRequest updateFunctionConfigurationRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the configuration parameters for the specified Lambda
     * function by using the values provided in the request. You provide only
     * the parameters you want to change. This operation must only be used on
     * an existing Lambda function and cannot be used to update the
     * function's code.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:UpdateFunctionConfiguration</code> action.
     * </p>
     *
     * @param updateFunctionConfigurationRequest Container for the necessary
     *           parameters to execute the UpdateFunctionConfiguration operation on
     *           AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateFunctionConfiguration service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateFunctionConfigurationResult> updateFunctionConfigurationAsync(UpdateFunctionConfigurationRequest updateFunctionConfigurationRequest,
            AsyncHandler<UpdateFunctionConfigurationRequest, UpdateFunctionConfigurationResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Invokes a specific Lambda function version.
     * </p>
     * <p>
     * If you don't provide the <code>Qualifier</code> parameter, it uses
     * the unqualified function ARN which results in invocation of the
     * $LATEST version of the Lambda function (when you create a Lambda
     * function, the $LATEST is the version). The AWS Lambda versioning and
     * aliases feature allows you to publish multiple versions of a Lambda
     * function and also create aliases for each function version. So each
     * your Lambda function version can be invoked using multiple ARNs. For
     * more information, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases-v2.html"> AWS Lambda Function Versioning and Aliases </a>
     * . Using the <code>Qualifier</code> parameter, you can specify a
     * function version or alias name to invoke specific function version. If
     * you specify function version, the API uses the qualified function ARN
     * to invoke a specific function version. If you specify alias name, the
     * API uses the alias ARN to invoke the function version to which the
     * alias points.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:InvokeFunction</code> action.
     * </p>
     *
     * @param invokeRequest Container for the necessary parameters to execute
     *           the Invoke operation on AWSLambda.
     * 
     * @return A Java Future object containing the response from the Invoke
     *         service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<InvokeResult> invokeAsync(InvokeRequest invokeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Invokes a specific Lambda function version.
     * </p>
     * <p>
     * If you don't provide the <code>Qualifier</code> parameter, it uses
     * the unqualified function ARN which results in invocation of the
     * $LATEST version of the Lambda function (when you create a Lambda
     * function, the $LATEST is the version). The AWS Lambda versioning and
     * aliases feature allows you to publish multiple versions of a Lambda
     * function and also create aliases for each function version. So each
     * your Lambda function version can be invoked using multiple ARNs. For
     * more information, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases-v2.html"> AWS Lambda Function Versioning and Aliases </a>
     * . Using the <code>Qualifier</code> parameter, you can specify a
     * function version or alias name to invoke specific function version. If
     * you specify function version, the API uses the qualified function ARN
     * to invoke a specific function version. If you specify alias name, the
     * API uses the alias ARN to invoke the function version to which the
     * alias points.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:InvokeFunction</code> action.
     * </p>
     *
     * @param invokeRequest Container for the necessary parameters to execute
     *           the Invoke operation on AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the Invoke
     *         service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<InvokeResult> invokeAsync(InvokeRequest invokeRequest,
            AsyncHandler<InvokeRequest, InvokeResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the resource policy, containing a list of permissions that
     * apply to a specific to an ARN that you specify via the
     * <code>Qualifier</code> paramter.
     * </p>
     * <p>
     * For informration about adding permissions, see AddPermission.
     * </p>
     * <p>
     * You need permission for the <code>lambda:GetPolicy action.</code>
     * </p>
     *
     * @param getPolicyRequest Container for the necessary parameters to
     *           execute the GetPolicy operation on AWSLambda.
     * 
     * @return A Java Future object containing the response from the
     *         GetPolicy service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetPolicyResult> getPolicyAsync(GetPolicyRequest getPolicyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the resource policy, containing a list of permissions that
     * apply to a specific to an ARN that you specify via the
     * <code>Qualifier</code> paramter.
     * </p>
     * <p>
     * For informration about adding permissions, see AddPermission.
     * </p>
     * <p>
     * You need permission for the <code>lambda:GetPolicy action.</code>
     * </p>
     *
     * @param getPolicyRequest Container for the necessary parameters to
     *           execute the GetPolicy operation on AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetPolicy service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetPolicyResult> getPolicyAsync(GetPolicyRequest getPolicyRequest,
            AsyncHandler<GetPolicyRequest, GetPolicyResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns configuration information for the specified event source
     * mapping (see CreateEventSourceMapping).
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:GetEventSourceMapping</code> action.
     * </p>
     *
     * @param getEventSourceMappingRequest Container for the necessary
     *           parameters to execute the GetEventSourceMapping operation on
     *           AWSLambda.
     * 
     * @return A Java Future object containing the response from the
     *         GetEventSourceMapping service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetEventSourceMappingResult> getEventSourceMappingAsync(GetEventSourceMappingRequest getEventSourceMappingRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns configuration information for the specified event source
     * mapping (see CreateEventSourceMapping).
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:GetEventSourceMapping</code> action.
     * </p>
     *
     * @param getEventSourceMappingRequest Container for the necessary
     *           parameters to execute the GetEventSourceMapping operation on
     *           AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetEventSourceMapping service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetEventSourceMappingResult> getEventSourceMappingAsync(GetEventSourceMappingRequest getEventSourceMappingRequest,
            AsyncHandler<GetEventSourceMappingRequest, GetEventSourceMappingResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of event source mappings you created using the
     * <code>CreateEventSourceMapping</code> (see CreateEventSourceMapping),
     * where you identify a stream as an event source. This list does not
     * include Amazon S3 event sources.
     * </p>
     * <p>
     * For each mapping, the API returns configuration information. You can
     * optionally specify filters to retrieve specific event source mappings.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:ListEventSourceMappings</code> action.
     * </p>
     *
     * @param listEventSourceMappingsRequest Container for the necessary
     *           parameters to execute the ListEventSourceMappings operation on
     *           AWSLambda.
     * 
     * @return A Java Future object containing the response from the
     *         ListEventSourceMappings service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListEventSourceMappingsResult> listEventSourceMappingsAsync(ListEventSourceMappingsRequest listEventSourceMappingsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of event source mappings you created using the
     * <code>CreateEventSourceMapping</code> (see CreateEventSourceMapping),
     * where you identify a stream as an event source. This list does not
     * include Amazon S3 event sources.
     * </p>
     * <p>
     * For each mapping, the API returns configuration information. You can
     * optionally specify filters to retrieve specific event source mappings.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:ListEventSourceMappings</code> action.
     * </p>
     *
     * @param listEventSourceMappingsRequest Container for the necessary
     *           parameters to execute the ListEventSourceMappings operation on
     *           AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListEventSourceMappings service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListEventSourceMappingsResult> listEventSourceMappingsAsync(ListEventSourceMappingsRequest listEventSourceMappingsRequest,
            AsyncHandler<ListEventSourceMappingsRequest, ListEventSourceMappingsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes specified Lambda function alias. For more information, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-v2-intro-aliases.html"> Introduction to AWS Lambda Aliases </a>
     * 
     * </p>
     * <p>
     * This requires permission for the lambda:DeleteAlias action.
     * </p>
     *
     * @param deleteAliasRequest Container for the necessary parameters to
     *           execute the DeleteAlias operation on AWSLambda.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteAlias service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteAliasAsync(DeleteAliasRequest deleteAliasRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes specified Lambda function alias. For more information, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-v2-intro-aliases.html"> Introduction to AWS Lambda Aliases </a>
     * 
     * </p>
     * <p>
     * This requires permission for the lambda:DeleteAlias action.
     * </p>
     *
     * @param deleteAliasRequest Container for the necessary parameters to
     *           execute the DeleteAlias operation on AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteAlias service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteAliasAsync(DeleteAliasRequest deleteAliasRequest,
            AsyncHandler<DeleteAliasRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the configuration information of the Lambda function. This
     * the same information you provided as parameters when uploading the
     * function by using CreateFunction.
     * </p>
     * <p>
     * You can use the optional <code>Qualifier</code> parameter to retrieve
     * configuration information for a specific Lambda function version. If
     * you don't provide it, the API returns information about the $LATEST
     * version of the function. For more information about versioning, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases-v2.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:GetFunctionConfiguration</code> operation.
     * </p>
     *
     * @param getFunctionConfigurationRequest Container for the necessary
     *           parameters to execute the GetFunctionConfiguration operation on
     *           AWSLambda.
     * 
     * @return A Java Future object containing the response from the
     *         GetFunctionConfiguration service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetFunctionConfigurationResult> getFunctionConfigurationAsync(GetFunctionConfigurationRequest getFunctionConfigurationRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the configuration information of the Lambda function. This
     * the same information you provided as parameters when uploading the
     * function by using CreateFunction.
     * </p>
     * <p>
     * You can use the optional <code>Qualifier</code> parameter to retrieve
     * configuration information for a specific Lambda function version. If
     * you don't provide it, the API returns information about the $LATEST
     * version of the function. For more information about versioning, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases-v2.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:GetFunctionConfiguration</code> operation.
     * </p>
     *
     * @param getFunctionConfigurationRequest Container for the necessary
     *           parameters to execute the GetFunctionConfiguration operation on
     *           AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetFunctionConfiguration service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetFunctionConfigurationResult> getFunctionConfigurationAsync(GetFunctionConfigurationRequest getFunctionConfigurationRequest,
            AsyncHandler<GetFunctionConfigurationRequest, GetFunctionConfigurationResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes an event source mapping. This means AWS Lambda will no longer
     * invoke the function for events in the associated source.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:DeleteEventSourceMapping</code> action.
     * </p>
     *
     * @param deleteEventSourceMappingRequest Container for the necessary
     *           parameters to execute the DeleteEventSourceMapping operation on
     *           AWSLambda.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteEventSourceMapping service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteEventSourceMappingResult> deleteEventSourceMappingAsync(DeleteEventSourceMappingRequest deleteEventSourceMappingRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes an event source mapping. This means AWS Lambda will no longer
     * invoke the function for events in the associated source.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:DeleteEventSourceMapping</code> action.
     * </p>
     *
     * @param deleteEventSourceMappingRequest Container for the necessary
     *           parameters to execute the DeleteEventSourceMapping operation on
     *           AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteEventSourceMapping service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteEventSourceMappingResult> deleteEventSourceMappingAsync(DeleteEventSourceMappingRequest deleteEventSourceMappingRequest,
            AsyncHandler<DeleteEventSourceMappingRequest, DeleteEventSourceMappingResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Identifies a stream as an event source for a Lambda function. It can
     * be either an Amazon Kinesis stream or an Amazon DynamoDB stream. AWS
     * Lambda invokes the specified function when records are posted to the
     * stream.
     * </p>
     * <p>
     * This is the pull model, where AWS Lambda invokes the function. For
     * more information, go to
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html"> AWS Lambda: How it Works </a>
     * in the <i>AWS Lambda Developer Guide</i> .
     * </p>
     * <p>
     * This association between an Amazon Kinesis stream and a Lambda
     * function is called the event source mapping. You provide the
     * configuration information (for example, which stream to read from and
     * which Lambda function to invoke) for the event source mapping in the
     * request body.
     * </p>
     * <p>
     * Each event source, such as an Amazon Kinesis or a DynamoDB stream,
     * can be associated with multiple AWS Lambda function. A given Lambda
     * function can be associated with multiple AWS event sources.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:CreateEventSourceMapping</code> action.
     * </p>
     *
     * @param createEventSourceMappingRequest Container for the necessary
     *           parameters to execute the CreateEventSourceMapping operation on
     *           AWSLambda.
     * 
     * @return A Java Future object containing the response from the
     *         CreateEventSourceMapping service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateEventSourceMappingResult> createEventSourceMappingAsync(CreateEventSourceMappingRequest createEventSourceMappingRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Identifies a stream as an event source for a Lambda function. It can
     * be either an Amazon Kinesis stream or an Amazon DynamoDB stream. AWS
     * Lambda invokes the specified function when records are posted to the
     * stream.
     * </p>
     * <p>
     * This is the pull model, where AWS Lambda invokes the function. For
     * more information, go to
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html"> AWS Lambda: How it Works </a>
     * in the <i>AWS Lambda Developer Guide</i> .
     * </p>
     * <p>
     * This association between an Amazon Kinesis stream and a Lambda
     * function is called the event source mapping. You provide the
     * configuration information (for example, which stream to read from and
     * which Lambda function to invoke) for the event source mapping in the
     * request body.
     * </p>
     * <p>
     * Each event source, such as an Amazon Kinesis or a DynamoDB stream,
     * can be associated with multiple AWS Lambda function. A given Lambda
     * function can be associated with multiple AWS event sources.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:CreateEventSourceMapping</code> action.
     * </p>
     *
     * @param createEventSourceMappingRequest Container for the necessary
     *           parameters to execute the CreateEventSourceMapping operation on
     *           AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateEventSourceMapping service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateEventSourceMappingResult> createEventSourceMappingAsync(CreateEventSourceMappingRequest createEventSourceMappingRequest,
            AsyncHandler<CreateEventSourceMappingRequest, CreateEventSourceMappingResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the code for the specified Lambda function. This operation
     * must only be used on an existing Lambda function and cannot be used to
     * update the function configuration.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:UpdateFunctionCode</code> action.
     * </p>
     *
     * @param updateFunctionCodeRequest Container for the necessary
     *           parameters to execute the UpdateFunctionCode operation on AWSLambda.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateFunctionCode service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateFunctionCodeResult> updateFunctionCodeAsync(UpdateFunctionCodeRequest updateFunctionCodeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the code for the specified Lambda function. This operation
     * must only be used on an existing Lambda function and cannot be used to
     * update the function configuration.
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:UpdateFunctionCode</code> action.
     * </p>
     *
     * @param updateFunctionCodeRequest Container for the necessary
     *           parameters to execute the UpdateFunctionCode operation on AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateFunctionCode service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateFunctionCodeResult> updateFunctionCodeAsync(UpdateFunctionCodeRequest updateFunctionCodeRequest,
            AsyncHandler<UpdateFunctionCodeRequest, UpdateFunctionCodeResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns list of aliases created for a Lambda function. For each
     * alias, the response includes information such as the alias ARN,
     * description, alias name, and the function version to which it points.
     * For more information, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-v2-intro-aliases.html"> Introduction to AWS Lambda Aliases </a>
     * 
     * </p>
     * <p>
     * This requires permission for the lambda:ListAliases action.
     * </p>
     *
     * @param listAliasesRequest Container for the necessary parameters to
     *           execute the ListAliases operation on AWSLambda.
     * 
     * @return A Java Future object containing the response from the
     *         ListAliases service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListAliasesResult> listAliasesAsync(ListAliasesRequest listAliasesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns list of aliases created for a Lambda function. For each
     * alias, the response includes information such as the alias ARN,
     * description, alias name, and the function version to which it points.
     * For more information, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-v2-intro-aliases.html"> Introduction to AWS Lambda Aliases </a>
     * 
     * </p>
     * <p>
     * This requires permission for the lambda:ListAliases action.
     * </p>
     *
     * @param listAliasesRequest Container for the necessary parameters to
     *           execute the ListAliases operation on AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListAliases service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListAliasesResult> listAliasesAsync(ListAliasesRequest listAliasesRequest,
            AsyncHandler<ListAliasesRequest, ListAliasesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * List all versions of a function.
     * </p>
     *
     * @param listVersionsByFunctionRequest Container for the necessary
     *           parameters to execute the ListVersionsByFunction operation on
     *           AWSLambda.
     * 
     * @return A Java Future object containing the response from the
     *         ListVersionsByFunction service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListVersionsByFunctionResult> listVersionsByFunctionAsync(ListVersionsByFunctionRequest listVersionsByFunctionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * List all versions of a function.
     * </p>
     *
     * @param listVersionsByFunctionRequest Container for the necessary
     *           parameters to execute the ListVersionsByFunction operation on
     *           AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListVersionsByFunction service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListVersionsByFunctionResult> listVersionsByFunctionAsync(ListVersionsByFunctionRequest listVersionsByFunctionRequest,
            AsyncHandler<ListVersionsByFunctionRequest, ListVersionsByFunctionResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the configuration information of the Lambda function and a
     * presigned URL link to the .zip file you uploaded with CreateFunction
     * so you can download the .zip file. Note that the URL is valid for up
     * to 10 minutes. The configuration information is the same information
     * you provided as parameters when uploading the function.
     * </p>
     * <p>
     * Using the optional <code>Qualifier</code> parameter, you can specify
     * a specific function version for which you want this information. If
     * you don't specify this parameter, the API uses unqualified function
     * ARN which return information about the $LATEST version of the Lambda
     * function. For more information, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases-v2.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:GetFunction</code> action.
     * </p>
     *
     * @param getFunctionRequest Container for the necessary parameters to
     *           execute the GetFunction operation on AWSLambda.
     * 
     * @return A Java Future object containing the response from the
     *         GetFunction service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetFunctionResult> getFunctionAsync(GetFunctionRequest getFunctionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns the configuration information of the Lambda function and a
     * presigned URL link to the .zip file you uploaded with CreateFunction
     * so you can download the .zip file. Note that the URL is valid for up
     * to 10 minutes. The configuration information is the same information
     * you provided as parameters when uploading the function.
     * </p>
     * <p>
     * Using the optional <code>Qualifier</code> parameter, you can specify
     * a specific function version for which you want this information. If
     * you don't specify this parameter, the API uses unqualified function
     * ARN which return information about the $LATEST version of the Lambda
     * function. For more information, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases-v2.html"> AWS Lambda Function Versioning and Aliases </a>
     * .
     * </p>
     * <p>
     * This operation requires permission for the
     * <code>lambda:GetFunction</code> action.
     * </p>
     *
     * @param getFunctionRequest Container for the necessary parameters to
     *           execute the GetFunction operation on AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetFunction service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetFunctionResult> getFunctionAsync(GetFunctionRequest getFunctionRequest,
            AsyncHandler<GetFunctionRequest, GetFunctionResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates an alias to the specified Lambda function version. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-v2-intro-aliases.html"> Introduction to AWS Lambda Aliases </a>
     * 
     * </p>
     * <p>
     * This requires permission for the lambda:CreateAlias action.
     * </p>
     *
     * @param createAliasRequest Container for the necessary parameters to
     *           execute the CreateAlias operation on AWSLambda.
     * 
     * @return A Java Future object containing the response from the
     *         CreateAlias service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateAliasResult> createAliasAsync(CreateAliasRequest createAliasRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates an alias to the specified Lambda function version. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-v2-intro-aliases.html"> Introduction to AWS Lambda Aliases </a>
     * 
     * </p>
     * <p>
     * This requires permission for the lambda:CreateAlias action.
     * </p>
     *
     * @param createAliasRequest Container for the necessary parameters to
     *           execute the CreateAlias operation on AWSLambda.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateAlias service method, as returned by AWSLambda.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSLambda indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateAliasResult> createAliasAsync(CreateAliasRequest createAliasRequest,
            AsyncHandler<CreateAliasRequest, CreateAliasResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;
}
        