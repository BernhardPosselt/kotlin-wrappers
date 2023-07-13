import ts from "typescript"

const unsafeDeclarations = [
    "DataRouterContext",
    "DataRouterStateContext",
    "LocationContext",
    "NavigationContext",
    "RouteContext",

    "enhanceManualRouteObjects",
]

export default (node) => {
    if (
        ts.isFunctionDeclaration(node)
        && node.name
        && unsafeDeclarations.some(name => node.name.text === name)
    ) {
        return `@JsName("UNSAFE_${node.name.text}")`
    }

    if (
        ts.isVariableDeclaration(node)
        && ts.isIdentifier(node.name)
        && unsafeDeclarations.some(name => node.name.text === name)
    ) {
        return `@JsName("UNSAFE_${node.name.text}")`
    }

    return null
}
