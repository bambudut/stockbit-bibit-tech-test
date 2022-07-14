export const commonResponse = {
    type: "object",
    properties: {
        code: {
            type: "number",
        },
        type: {
            type: "string",
        },
        message: {
            type: "string",
        },
    },
    required: ["code"],
};