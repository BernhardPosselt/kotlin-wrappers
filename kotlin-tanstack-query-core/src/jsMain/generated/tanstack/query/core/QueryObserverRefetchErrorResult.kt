// Automatically generated - do not modify!

package tanstack.query.core

external interface QueryObserverRefetchErrorResult<TData, TError>
    : QueryObserverResult<TData, TError> {
    override val data: TData
    override val error: TError
    override val isError: True
    override val isLoading: False
    override val isLoadingError: False
    override val isRefetchError: True
    override val isSuccess: False
    override val status: QueryStatus /* 'error' */
}