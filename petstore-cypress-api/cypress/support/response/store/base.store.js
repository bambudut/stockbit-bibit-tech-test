export const storeResponse = {
    type: "object",
    properties: {
        id: {
            type: "number",
        },
        petId: {
            type: "number",
        },
        quantity: {
            type: "number",
        },
        shipDate: {
            type: "string",
        },
        status: {
            type: "string",
        },
        complete: {
            type: "boolean",
        },
    },
    required: ["id", "petId", "status"],
};